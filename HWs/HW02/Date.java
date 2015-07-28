/* Date.java */
/**
 * @author STEPHEN YOUNG
 * @author S&S
 * @version 1.0
 */

import java.util.regex.*;

class Date {

	/* Date object private data fields here. */
	private int month, day, year;

	/**
	 * Constructs a date with the given month, day and year. If the date is not
	 * valid, the entire program will halt with an error message.
	 * 
	 * @param month
	 *            is a month, numbered in the range 1...12.
	 * @param day
	 *            is between 1 and the number of days in the given month.
	 * @param year
	 *            is the year in question, with no digits omitted.
	 */
	public Date(int month, int day, int year) {
		if (isValidDate(month, day, year)) {
			this.month = month;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Waring: Invalid Date !!!");
			System.exit(0);
		}
	}

	/**
	 * Constructs a Date object corresponding to the given string.
	 * 
	 * @param s
	 *            should be a string of the form "month/day/year" where month
	 *            must be one or two digits, day must be one or two digits, and
	 *            year must be between 1 and 4 digits. If s does not match these
	 *            requirements or is not a valid date, the program halts with an
	 *            error message.
	 */
	public Date(String s) {

	}

	/**
	 * Checks whether the given year is a leap year.
	 * 
	 * @return true if and only if the input year is a leap year.
	 */
	/*
	 * public static boolean isLeapYear(int year) { boolean isLeapYear = false;
	 * if(year % 4 != 0){ isLeapYear = false; }else if(year % 100 !=0 ){
	 * isLeapYear = true; }else if(year % 400 != 0) { isLeapYear = false; }else
	 * { isLeapYear = true; } return isLeapYear; }
	 */
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	/**
	 * Returns the number of days in a given month.
	 * 
	 * @param month
	 *            is a month, numbered in the range 1...12.
	 * @param year
	 *            is the year in question, with no digits omitted.
	 * @return the number of days in the given month.
	 */
	public static int daysInMonth(int month, int year) {
		int numberOfDays = 0;
		switch (month) {
		case 1:
			numberOfDays = 31;
			break;
		case 2:
			if (isLeapYear(year)) {
				numberOfDays = 29;
			} else {
				numberOfDays = 28;
			}
			break;
		case 3:
			numberOfDays = 31;
			break;
		case 4:
			numberOfDays = 30;
			break;
		case 5:
			numberOfDays = 31;
			break;
		case 6:
			numberOfDays = 30;
			break;
		case 7:
			numberOfDays = 31;
			break;
		case 8:
			numberOfDays = 31;
			break;
		case 9:
			numberOfDays = 30;
			break;
		case 10:
			numberOfDays = 31;
			break;
		case 11:
			numberOfDays = 30;
			break;
		case 12:
			numberOfDays = 31;
			break;
		}
		return numberOfDays;
	}

	/**
	 * Checks whether the given date is valid.
	 * 
	 * @return true if and only if month/day/year constitute a valid date.
	 * 
	 *         Years prior to A.D. 1 are NOT valid.
	 */
	public static boolean isValidDate(int month, int day, int year) {
		boolean isValidDate = false;
		switch (month) {
		case 1:
			isValidDate = 1 <= day && day <= 31;
			break;
		case 2:
			if (isLeapYear(year))
				isValidDate = 1 <= day && day <= 29;
			else
				isValidDate = 1 <= day && day <= 28;
			break;
		case 3:
			isValidDate = 1 <= day && day <= 31;
			break;
		case 4:
			isValidDate = 1 <= day && day <= 30;
			break;
		case 5:
			isValidDate = 1 <= day && day <= 31;
			break;
		case 6:
			isValidDate = 1 <= day && day <= 30;
			break;
		case 7:
			isValidDate = 1 <= day && day <= 31;
			break;
		case 8:
			isValidDate = 1 <= day && day <= 31;
			break;
		case 9:
			isValidDate = 1 <= day && day <= 30;
			break;
		case 10:
			isValidDate = 1 <= day && day <= 31;
			break;
		case 11:
			isValidDate = 1 <= day && day <= 30;
			break;
		case 12:
			isValidDate = 1 <= day && day <= 31;
			break;
		}
		return (1 <= month && month <= 12) && (1 <= day && day <= 31)
				&& (1 <= year) && isValidDate;
	}

	/**
	 * Returns a string representation of this date in the form month/day/year.
	 * The month, day, and year are expressed in full as integers; for example,
	 * 12/7/2006 or 3/21/407.
	 * 
	 * @return a String representation of this date.
	 */
	@Override
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}

	/**
	 * Determines whether this Date is before the Date d.
	 * 
	 * @return true if and only if this Date is before d.
	 */
	public boolean isBefore(Date d) {
		if (this.year < d.year) {
			return true;
		} else if (this.year == d.year && this.month < d.month) {
			return true;
		} else if (this.month == d.month && this.day < d.day) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines whether this Date is after the Date d.
	 * 
	 * @return true if and only if this Date is after d.
	 */
	public boolean isAfter(Date d) {
		if (this.year > d.year) {
			return true;
		} else if (this.year == d.year && this.month > d.month) {
			return true;
		} else if (this.month == d.month && this.day > d.day) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns the number of this Date in the year.
	 * 
	 * @return a number n in the range 1...366, inclusive, such that this Date
	 *         is the nth day of its year. (366 is used only for December 31 in
	 *         a leap year.)
	 */
	public int dayInYear() {
		int numberOfDate = 0;

		switch (this.month) {
		case 1:
			numberOfDate = this.day;
			break;
		case 2:
			numberOfDate = this.day + 31;
			// numberOfDate = this.day + daysInMonth(1, this.year);
			break;
		case 3:
			numberOfDate = this.day + 31 + 29;
			break;
		case 4:
			numberOfDate = this.day + 31 + 29 + 31;
			break;
		case 5:
			numberOfDate = this.day + 31 + 29 + 31 + 30;
			break;
		case 6:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31;
			break;
		case 7:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31 + 30;
			break;
		case 8:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31
					+ 30;
			break;
		case 11:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31
					+ 30 + 31;
			break;
		case 12:
			numberOfDate = this.day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31
					+ 30 + 31 + 30;
			break;
		}
		return numberOfDate;
	}

	/**
	 * Determines the difference in days between d and this Date. For example,
	 * if this Date is 12/15/2012 and d is 12/14/2012, the difference is 1. If
	 * this Date occurs before d, the result is negative.
	 * 
	 * @return the difference in days between d and this date.
	 */
	public int difference(Date d) {
		/*
		if (this.isBefore(d) == true) { 											// Negative number.
			difference = -(-365 * (this.year - d.year) + (this.day - d.day) + 30
					* (this.month - d.month));
		} else if (this.isAfter(d) == true) {
			difference = 365 * (this.year - d.year) + this.day - d.day + 30
					* (this.month - d.month);
		} else {
			difference = 0;
		}
		*/
		int countLeap = 0;
		int countEndOfMonth = 0;
		if (this.isBefore(d) == true) { // First to count difference at year
										// level.
			for (int x = this.year; x < d.year; x++) {
				if (isLeapYear(x)) { // Find all leap years between two input
										// years.
					countLeap++; // Number of days in non-leap year is 365.
				} // Every count of a leap year adds one more day to the
					// counter.
			}
		} else if (this.isAfter(d) == true) {
			for (int x = d.year; x < this.year; x++) {
				if (isLeapYear(x)) {
					countLeap++;
				}
			}
		} else {
			countLeap = 0;
		}
		
		
		if (this.isBefore(d) == true) {
			for (int x = this.year; x < d.year; x++) {
				while (isLeapYear(x)) {
					countLeap++;
				}
			}
		}
		return Math.abs(365 * (this.year - d.year))
				+ Math.abs(this.day - d.day)
				+ Math.abs(30 * (this.month - d.month)) + countLeap;
	}

	public static void main(String[] argv) {
		System.out.println("\nTesting constructors.");
		Date d1 = new Date(1, 1, 1);
		System.out.println("Date should be 1/1/1: " + d1);
		d1 = new Date("2/4/2");
		System.out.println("Date should be 2/4/2: " + d1);
		d1 = new Date("2/29/2000");
		System.out.println("Date should be 2/29/2000: " + d1);
		d1 = new Date("2/29/1904");
		System.out.println("Date should be 2/29/1904: " + d1);

		d1 = new Date(12, 31, 1975);
		System.out.println("Date should be 12/31/1975: " + d1);
		Date d2 = new Date("1/1/1976");
		System.out.println("Date should be 1/1/1976: " + d2);
		Date d3 = new Date("1/2/1976");
		System.out.println("Date should be 1/2/1976: " + d3);

		Date d4 = new Date("2/27/1977");
		Date d5 = new Date("8/31/2110");
		// Date d6 = new Date(13, 2, 2000); // Testing invalid constructor error
		// message.

		/* Test Driver to test the isLeapYear function! */
		System.out.println("\nTesting isLeapYear fucntion:");
		System.out
				.println("1600 is a leap year. Expected Result: true. Actual Result: "
						+ isLeapYear(1600)); // Test01.
		System.out
				.println("1800 is not a leap year. Expected Result: false. Actual Result: "
						+ isLeapYear(1800)); // Test02.
		System.out
				.println("1900 is not a leap year. Expected Result: false. Actual Result: "
						+ isLeapYear(1900)); // Test03.
		System.out
				.println("2000 is a leap year. Expected Result: true.  Actual Result: "
						+ isLeapYear(2000)); // Test04.
		System.out
				.println("2015 is not a leap year. Expected Result: false. Actual Result: "
						+ isLeapYear(2015)); // Test05.

		/* Test Driver to test the daysInMonth function! */
		System.out.println("\nTesting daysInMonth fucntion:");
		System.out.println("Expected Result: 28." + "Actual Result: "
				+ daysInMonth(2, 2015)); // Test01.
		System.out.println("Expected Result: 29." + "Actual Result: "
				+ daysInMonth(2, 2016)); // Test02.
		System.out.println("Expected Result: 30." + "Actual Result: "
				+ daysInMonth(6, 2015)); // Test03.
		System.out.println("Expected Result: 31." + "Actual Result: "
				+ daysInMonth(8, 2015)); // Test04.

		/* Test Driver to test the isValidDate function! */
		System.out.println("\nTesting isValidDate fucntion:");
		System.out.println("Expected Result: false. Actual Result: "
				+ isValidDate(2, 28, 2015)); // Test01.
		System.out.println("Expected Result: true. Actual Result: "
				+ isValidDate(3, 31, 2015)); // Test02.
		System.out.println("Expected Result: false. Actual Result: "
				+ isValidDate(13, 30, 2015)); // Test03.
		System.out.println("Expected Result: true. Actual Result: "
				+ isValidDate(2, 28, 2000)); // Test04.
		System.out.println("Expected Result: true. Actual Result: "
				+ isValidDate(6, 15, 2015)); // Test05.

		/* Test Driver to test the dayInYear function! */
		System.out.println("\nTesting dayInYear fucntion:");
		Date d6 = new Date(10, 30, 1980);
		Date d7 = new Date(12, 5, 1980);
		Date d8 = new Date(6, 15, 2015);
		System.out.println(d6.dayInYear());
		System.out.println(d7.dayInYear());
		System.out.println(d8.dayInYear());

		/* Test Driver to test the isBefore and isAfter function! */
		System.out.println("\nTesting before and after.");
		System.out.println(d2 + " after " + d1 + " should be true: "
				+ d2.isAfter(d1));
		System.out.println(d3 + " after " + d2 + " should be true: "
				+ d3.isAfter(d2));
		System.out.println(d1 + " after " + d1 + " should be false: "
				+ d1.isAfter(d1));
		System.out.println(d1 + " after " + d2 + " should be false: "
				+ d1.isAfter(d2));
		System.out.println(d2 + " after " + d3 + " should be false: "
				+ d2.isAfter(d3));
		System.out.println("\n");
		System.out.println(d1 + " before " + d2 + " should be true: "
				+ d1.isBefore(d2));
		System.out.println(d2 + " before " + d3 + " should be true: "
				+ d2.isBefore(d3));
		System.out.println(d1 + " before " + d1 + " should be false: "
				+ d1.isBefore(d1));
		System.out.println(d2 + " before " + d1 + " should be false: "
				+ d2.isBefore(d1));
		System.out.println(d3 + " before " + d2 + " should be false: "
				+ d3.isBefore(d2));

		System.out.println("\nTesting difference.");
		System.out.println(d1 + " - " + d1 + " should be 0: "
				+ d1.difference(d1));
		System.out.println(d2 + " - " + d1 + " should be 1: "
				+ d2.difference(d1));
		System.out.println(d3 + " - " + d1 + " should be 2: "
				+ d3.difference(d1));
		System.out.println(d3 + " - " + d4 + " should be -422: "
				+ d3.difference(d4));
		System.out.println(d5 + " - " + d4 + " should be 48762: "
				+ d5.difference(d4));
	}
}

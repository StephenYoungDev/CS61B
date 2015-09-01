import java.io.*;

class PrimeNumber{
    public static void main(String[] arg) throws IOException {
	
    System.out.println("Please Enter an Integer Number: ");
    BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
    //int inputNum = keybd.read();
    int inputNum = Integer.parseInt(keybd.readLine());

    System.out.println("Test current inputNum value:  " + inputNum);
    if (isPrime(inputNum)) {
	System.out.println(inputNum + " is a prime number.");
    }else {
	System.out.println(inputNum + " is not a prime number.");
    }
    }

    public static boolean isPrime(int n){
	int divisor = 2;
	while(divisor < n) {
	    if(n % divisor == 0) {
		return false;
	    }
	    divisor++;
	}
	return true;
    }
}

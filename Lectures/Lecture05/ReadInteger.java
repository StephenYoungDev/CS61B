import java.io.*;

/* Use static method parseInt() from Integer class. BufferedReader to read inputfrom system and check NumberFormatException from first input. */

public class ReadInteger{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean check;
        int i = 0;
        System.out.print("Please Enter an Integer: ");
        do{
            check = true;
            try{
                i = Integer.parseInt(in.readLine());
            } catch (NumberFormatException e){
                System.err.println("Input error - Invalid value for an Integer.");
                System.out.print("Reinsert: ");
                check = false;
            }
        } while (!check);
        System.out.print("The Integer you entered is : " + i);
    }
}


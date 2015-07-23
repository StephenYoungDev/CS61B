import java.io.*;

public class Nuke2 {
	public static void main(String[] args) throws IOException{
		BufferedReader keyboard;
		String inputString;
		String outputString;
		
		
		keyboard = new BufferedReader(new InputStreamReader((System.in)));
		System.out.println("Please enter your string without space:");
		System.out.flush();
		
		inputString = keyboard.readLine();
//		System.out.println(inputString);
//		System.out.println(inputString.hashCode());
//		System.out.println(inputString.intern());
		
		outputString = inputString.charAt(0) + inputString.substring(2);
		System.out.println(outputString.trim());
	}	
}

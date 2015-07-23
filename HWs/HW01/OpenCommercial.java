/* OpenCommercial.java */

/**
 * @author Stephen Young
 * @author S&S
 * @version 1.0 
 */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;
    
    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    URL url = new URL("http://www." + inputLine.toLowerCase() + ".co.nz");					// Make sure HTTP protocol header is included.
    URLConnection con = url.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

    String[] lines = new String[5]; // keep read in lines in array.
    for(int i = 0; i < lines.length; i++){
	lines[i] = in.readLine();
	System.out.println(lines[i]);
	//lines[i] = inputLine;
  }
    in.close();

    System.out.println("Reverse Lines goes:\n");
    System.out.println(lines[4]);
    System.out.println(lines[3]);
    System.out.println(lines[2]);
    System.out.println(lines[1]);
    System.out.println(lines[0]);
    
    for(int i = lines.length; i < lines.length; i--){
	System.out.println(lines[i]);
    }
  }
}

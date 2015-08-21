import java.net.*;
import java.io.*;

class WHWWW{
    public static void main(String[] arg) throws IOException {
	URL link = new URL("http://www.whitehouse.gov/");
	InputStream ins = link.openStream();
	InputStreamReader isr = new InputStreamReader(ins);
	BufferedReader bf = new BufferedReader(isr);
	System.out.println(bf.readLine());	    
    }	    
}

package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class copyANinaryFilephoto {
public static void main(String[] args) throws Exception {
	
	String s = "C:\\Users\\admin\\Desktop\\New folder (2)\\aaru.jpg";
	String t = "C:\\Users\\admin\\Desktop\\New folder (2)\\babu.jpg";
	
	FileInputStream F = new FileInputStream(s);
	FileOutputStream  Fi = new FileOutputStream(t);
	
	int ch = F.read();
	while (ch !=-1) {
		Fi.write(ch);
		ch = F.read();
	
	}
	Fi.close();
	F.close();
	System.out.println(s+"is copies to "+t);
	
}
}

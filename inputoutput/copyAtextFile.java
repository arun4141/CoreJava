package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class copyAtextFile {
	
	public static void main(String[] args) throws Exception {
		
		String s = "C:\\Users\\admin\\Desktop\\New folder (2)\\qwer.txt";
		String t = "C:\\Users\\admin\\Desktop\\New folder (2)\\aaru.txt";
		
		FileReader F = new FileReader(s);
		FileWriter fw = new FileWriter(t);
		
		
		int ch = F.read();
		while (ch !=-1) {
			fw.write(ch);
			ch = F.read();
			
		}
		
		fw.close();
		F.close();
		System.out.println(s+ "is copied to "+ t );
		
	}

}

package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File3 {
	
	public static void main(String[] args) throws IOException {
			
		FileReader reader = new FileReader("C:\\Users\\admin\\Desktop\\qwer.txt");
		
		int ch=reader.read();
		char c;
		while (ch !=-1) {
			c = (char) ch;
			System.out.print(c);
			ch = reader.read();
			
		}
		reader.close();
		}
		
}



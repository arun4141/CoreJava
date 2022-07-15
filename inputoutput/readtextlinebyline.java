package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readtextlinebyline {
	public static void main(String[] args) throws Exception {
		
		FileReader r = new FileReader("C:\\Users\\admin\\Desktop\\New folder (2)\\read text line by line.txt");
		
		BufferedReader br = new BufferedReader(r);
		
		int ch = br.read();
		String line = br.readLine();
		System.out.println(line);
		
	}

}

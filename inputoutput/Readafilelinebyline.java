package inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readafilelinebyline {
	
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:\\Users\\admin\\Desktop\\New folder (2)\\line.txt");
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("START");
		System.out.println("-----");
		
		String line = br.readLine();
		
		while (line !=null) {
			System.out.println(line);
			line = br.readLine();
			}
		reader.close();
	}

}

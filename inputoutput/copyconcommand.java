package inputoutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.sound.sampled.Line;

public class copyconcommand {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\New folder (2)\\copyconcommand.txt");
          PrintWriter printWriter	= new PrintWriter(writer);
          
          System.out.println("START");
          System.out.println("-----");
          
          InputStreamReader isReader = new InputStreamReader(System.in);    
          BufferedReader in = new BufferedReader(isReader);
          
          String line = in.readLine();
          while( !line.equals("close")) {
        	  printWriter .print(line);
        	  line = in.readLine();
        	  
          }
			printWriter.close();
			isReader.close();
          
		}
        	  
          
	}


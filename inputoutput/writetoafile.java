package inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writetoafile {
	public static void main(String[] args) throws Exception {
		
		 FileWriter F = new FileWriter("C:\\Users\\admin\\Desktop\\New folder (2)\\sonu 1.txt",true); 
		 
		 PrintWriter pw = new PrintWriter(F);
		  
		 for (int i = 0; i < 5; i++) {
			 pw.println(i+  "rays");
		}
			
		
		 
		
		 
		
		 pw.close();
		 F.close();
		 
		 System.out.println("done");
				 
				 
		 
	}

}

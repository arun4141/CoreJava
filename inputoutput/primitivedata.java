package inputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class primitivedata {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream File = new FileOutputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\primitive.txt");
	    DataOutputStream out = new DataOutputStream(File);
	    
	    out.writeInt(1);
	    out.writeBoolean(true);
	    out.writeChar('A');
	    out.writeDouble(5.5);
	   
	    out.close();
	    File.close();
	    System.out.println("Done");
	   
	    
	}

}

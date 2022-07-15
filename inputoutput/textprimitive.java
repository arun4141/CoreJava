package inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class textprimitive {
	
	public static void main(String[] args) throws Exception {
		 FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\primitive.txt");
		 DataInputStream out = new DataInputStream(file);
		 
		 System.out.println(out.readInt());
		 System.out.println(out.readBoolean());
		 System.out.println(out.readChar());
		 System.out.println(out.readDouble());
		 
		 out.close();
	}

}

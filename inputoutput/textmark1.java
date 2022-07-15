package inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class textmark1 {
public static void main(String[] args) throws Exception  {
	FileOutputStream file = new FileOutputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\mark3.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
    Marksheet3const mark = new Marksheet3const("arun", 45, 58, 75, 0);
    
    out.writeObject(mark);
    out.close();
    System.out.println("Done");
    System.out.println("------");
}
}

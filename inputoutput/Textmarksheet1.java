package inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Textmarksheet1 {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream File = new FileOutputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\marksheetbean.txt");
		ObjectOutputStream out = new ObjectOutputStream(File);
		
		
		MarksheetBean m = new MarksheetBean();
		
		m.setName("Arun singh mandloi");
		m.setChemistry(78);
		m.setMaths(85);
		m.setPhysics(58);
		m.setTemp(12);
		
		
		out.writeObject(m);
		out.close();
		System.out.println("Done");
		System.out.println("-----");
		
	}

}

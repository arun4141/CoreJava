package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import javax.swing.plaf.FontUIResource;

public class testEmployee2 {
	public static void main(String[] args) throws Exception {

		FileInputStream F = new FileInputStream("C:\\Users\\admin\\Desktop\\qwer.txt");
		ObjectInputStream out = new ObjectInputStream(F);

		Employee e = (Employee) out.readObject();

		System.out.println(e.getId());
		System.out.println("-----------------------------");
		System.out.println(e.getUsername());
		System.out.println("-----------------------------");
		System.out.println(e.getPwd());
		System.out.println("-----------------------------");
	}

}

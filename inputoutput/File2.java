package inputoutput;

import java.io.File;

public class File2 {

	public static void main(String[] args) {

		File F = new File("C:\\Morpho\\MorphoSmart USB Driver");
		
		
		
		String[] li = F.list();

		for (String string : li) {
			

			System.out.println(string);

		}

	}
}

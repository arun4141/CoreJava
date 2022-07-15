package inputoutput;
import java.io.File;
import java.util.Date;

public class File1 {
	public static void main(String[] args) {
		
		File F = new File("C:\\Morpho\\MorphoSmart USB Driver");
		
		if (F.exists()) {
			System.out.println(F.getName());
			System.out.println(F.getAbsolutePath());
			System.out.println(F.canWrite());
			System.out.println(F.canRead());
			System.out.println(F.isFile());
			System.out.println(F.isDirectory());
			System.out.println(new Date(F.lastModified()));
			System.out.println(F.length()+" bytes long");
		}
		 
			
		
	}

}

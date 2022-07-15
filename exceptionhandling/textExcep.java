package exceptionhandling;

public class textExcep {
	
public static void main(String[] args) {
	    
	String s = "arun";
       try {
    	   System.out.println(s.length());
    	   System.out.println(s.indexOf("3"));
	} catch (NullPointerException e) {
		System.out.println(e.getMessage());
	}catch (RuntimeException e) {
		System.out.println(e.getMessage());
	
	
	}finally {
		
		System.out.println("i am final");
	
		
	
}

}
}

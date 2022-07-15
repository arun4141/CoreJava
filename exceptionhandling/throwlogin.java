package exceptionhandling;

public class throwlogin {
	
	public static void main(String[] args) throws loginException {
		
		first("vijay");
		
		
	}
	
	public static void first (String aa) throws loginException {
		
		secend("arun");
		
	}
	public static void secend(String bb) throws loginException {
		
		loginException l = new loginException ();
		
		throw l;
		
	}

}

package exceptionhandling;

public class testlogin {
	public static void main(String[] args)  {
	
	first("vijay");

}
private static void first(String logString)  {
	if(!logString.equals("admin")) {
		
		loginException l = new loginException();
		
		try {
			throw l;
		} catch (loginException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	
		
		
	}
	
	
}
}

package exceptionhandling;

public class loginException extends Exception {

	public loginException() {
		super("system not found");
		
	}
	public loginException(String s) {
		
		super("insufficent balance");
		
	}

		
		
	
}

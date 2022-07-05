package exceptionhandling;

public class exceotion {
	public static void main(String[] args) {
		
		try {
			
			double d = 10/5;
			System.out.println(d);
			
		} catch (ArithmeticException e) {
			System.err.println("/ by zero");
			
			e.printStackTrace();
			
			
		} finally {
			System.out.println("i am final");
			
			
		}
	}

}

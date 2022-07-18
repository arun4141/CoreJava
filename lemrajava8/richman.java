package lemrajava8;

public interface richman {
	
	public void party ();
	
	public void socilwork ();
	
	public void employee ();
	
	
	
	
	public default void textD() {
		System.out.println("default");
	}
	
	public static void textF() {
		System.out.println("hello");
	}
   
	 
}

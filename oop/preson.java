package exercise.oop;

public class preson {
	private String firstName;
	private String lastName;
	
	
	public preson(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + lastName;
	}
 public static void main(String[] args) {
	 
	 preson p = new preson("Arun singh ","Mandloi");
	 System.out.println(p.toString());
}

}

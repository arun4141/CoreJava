package exercise.oop;

public class Businessman implements richman {

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("donete for social work");
	}

	@Override
	public void partyc() {
		// TODO Auto-generated method stub
		System.out.println("maja ni life");
	}
	
	public static void main(String[] args) {
		richman r = new Businessman();
		Businessman b = new Businessman();
		b.donation();
		b.partyc();
		}
            

}

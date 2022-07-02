package exercise.oop;

public class TigerChild extends Tiger{
	
	public static void eat() {
		System.out.println("TigerChild is eating hiranChild");

}
	public static void main(String[] args) {
		
		TigerChild t = new TigerChild();
		
		t.eat();
	}
}

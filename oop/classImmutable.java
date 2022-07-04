package exercise.oop;

public final class classImmutable {
	
	private final String name;
	private final int age ;
	
	
	
	public classImmutable(String name, int age) {
	
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		classImmutable c = new classImmutable("arun", 21);
		
			
		
		System.out.println(c.getName());
		System.out.println("--------");
		System.out.println(c.getAge());
		
	}
}

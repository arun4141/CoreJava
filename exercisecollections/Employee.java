package exercisecollections;

public class Employee  {

	private String Fname ;
	private String Lname;
	private int age;
	private int salary;
	

 public Employee() {
	
 }
	
	public Employee(String fname, String lname, int age, int salary) {
	super();
	Fname = fname;
	Lname = lname;
	this.age = age;
	this.salary = salary;
}

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	
		
		
		
	}



package perameterisee;

public class Employee extends person {
	
	private String designation;
	
	public Employee () {
		
		System.out.println("defoult employee");
	}
               public Employee (String fn,String ln,String des) {
            	   super(fn,ln);
            	   designation = des;
            	   System.out.println("3 perametar Employee" + designation);
               }
              public static void main(String[] args) {
				Employee e = new Employee("vijay", "jain", "developar"); 
			}

}

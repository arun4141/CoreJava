package exercisecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class testEmp {
	
public static void main(String[] args) {
		
		Employee E = new Employee("arun", "mandloi", 21, 20000);
		Employee E1 = new Employee("nikita", "rathod", 20, 50000);
		Employee E2 = new Employee("Aryan", "sharma", 21, 60000);
		Employee E3 = new Employee("Anshul", "parjapat", 20, 70000);
		
		ArrayList a = new ArrayList<>();
		orderbysalary o = new orderbysalary();
	
		
		a.add(E);
		a.add(E1);
		a.add(E2);
		a.add(E3);
		
	    Collections.sort(a, o);
		
		Iterator it= a.iterator();
		while (it.hasNext()) {
			Employee em = (Employee) it.next();
			System.out.println(em.getFname()+"\t"+em.getLname()+"\t"+em.getAge()+"\t"+em.getSalary());
			
		}
		

}
}

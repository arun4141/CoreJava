package exercisecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class textEmp1 {
	
	public static void main(String[] args) {
		
		  Employee1 Em = new Employee1("drun", "umnadloi", 58, 78);
		  Employee1 Em1 = new Employee1("chotu", "patel", 74, 65);
		  
		  
		  ArrayList A = new ArrayList<>();
		 
		  A.add(Em);
		  A.add(Em1);
		  
		  Collections.sort(A,new orderbyFname());
		  
		 Iterator it = A.iterator();
		 while (it.hasNext()) {
			Employee1 em= (Employee1) it.next();
			System.out.println(em.getFname()+" "+em.getLname()+" "+em.getAge()+" "+em.getSalary());
			
		}
		  
		
	}

}

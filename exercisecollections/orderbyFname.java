package exercisecollections;

import java.util.Comparator;

public class orderbyFname implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 arg0, Employee1 arg1) {
		// TODO Auto-generated method stub
		return arg0.getFname().compareTo(arg1.getFname());
	}

}

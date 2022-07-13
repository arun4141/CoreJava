package collectionsframework;

import java.util.Comparator;

public class employeesalarycomparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return arg0.getSalary() - arg1.getSalary();
	}

}

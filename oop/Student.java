package person.set.get.oop;

public class Student extends Person {

	private String RollNo ;
	
	private int marks ;
	
  public Student () {
	  
  }

public String getRollNo() {
	return RollNo;
}

public void setRollNo(String rollNo) {
	RollNo = rollNo;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}
	
}

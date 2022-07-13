package marksheet;

public class marksheet implements Comparable<marksheet> {
	
	private String Rollno;
	private String Fname;
	private String Lname;
	private int id;
	
	
	public String getRollno() {
		return Rollno;
	}
	public void setRollno(String rollno) {
		Rollno = rollno;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	
	}
	@Override
	public int compareTo(marksheet o) {
		
		return this.id-o.id ;
	}
	
	}
	
	
	



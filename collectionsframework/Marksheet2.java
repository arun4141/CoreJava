package collectionsframework;

public class Marksheet2 {
	
	private String rollno;
	private String fname;
	private String lname;
	private int sos;
	private int english;
	private int manthes;
	
	public Marksheet2() {
		
	}

	public Marksheet2(String rollno, String fname, String lname, int sos, int english, int manthes) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.sos = sos;
		this.english = english;
		this.manthes = manthes;
	}

	public String getRollno() {
		return rollno;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getSos() {
		return sos;
	}

	public int getEnglish() {
		return english;
	}

	public int getManthes() {
		return manthes;
	}
	
	

}

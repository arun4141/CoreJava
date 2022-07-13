package collectionsframework;

public class marksheet implements Comparable<marksheet>{
	
	
	private String rollno;
	private String fname;
	private String Mname;
	private String lname;
	private int sos;
	private int english;
	private int manthes;
	private int sanskrit;
	private int sec; 
	private int hindi;
	
	
	
	public String getRollno() {
		return rollno;
	}



	public void setRollno(String rollno) {
		this.rollno = rollno;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getMname() {
		return Mname;
	}



	public void setMname(String mname) {
		Mname = mname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getSos() {
		return sos;
	}



	public void setSos(int sos) {
		this.sos = sos;
	}



	public int getEnglish() {
		return english;
	}



	public void setEnglish(int english) {
		this.english = english;
	}



	public int getManthes() {
		return manthes;
	}



	public void setManthes(int manthes) {
		this.manthes = manthes;
	}



	public int getSanskrit() {
		return sanskrit;
	}



	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}



	public int getSec() {
		return sec;
	}



	public void setSec(int sec) {
		this.sec = sec;
	}



	public int getHindi() {
		return hindi;
	}



	public void setHindi(int hindi) {
		this.hindi = hindi;
	}



	@Override
	public int compareTo(marksheet o) {
		// TODO Auto-generated method stub
		return this.fname.compareTo(o.fname);
	}
	
	
	
	

}

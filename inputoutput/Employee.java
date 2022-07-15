package inputoutput;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String username;
	private String pwd;

	public Employee() {

	}

	public Employee(int id, String username, String pwd) {

		this.id = id;
		this.username = username;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}

	

}

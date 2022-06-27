package com.rays.oop;

public class constructor {
	
	private String name;
	private String Address;
    private int number;
    private String colur;
    
	public constructor(String name, String address, int number, String colur) {
		
		this.name = name;
		Address = address;
		this.number = number;
		this.colur = colur;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return Address;
	}

	public int getNumber() {
		return number;
	}

	public String getColur() {
		return colur;
	}
    
}

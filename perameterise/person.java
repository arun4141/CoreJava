package com.rays.perameterise;

public class person {
	
	private String fname;
	private String lname;
	private String address;
	
	public person() {
		System.out.println("Defoult perametar constructr");
		
	}	
    public person(String fn, String ln ) {
    	fname = fn;
    	lname = ln;
    	System.out.println("2 perametar constructr " + fname + lname);
	}	
    
    public person(String fn, String ln, String add) {
    	this (fn,ln);
    	address = add;
    	System.out.println("3 perametar constructr "+ fname + lname + address);
    }
    public static void main(String[] args) {
		person p = new person(" rays ", " tec ", " indore ");
	}
	
	
}
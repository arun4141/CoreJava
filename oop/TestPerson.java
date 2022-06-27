package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person p = new Person();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String s = "21/07/2000";

		Date d = sdf.parse(s);

		p.setName("Arun");
		p.setDob(d);
		p.setAddress("Indore");

		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());

	}

}

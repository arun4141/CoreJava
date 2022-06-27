package com.rays.oop;

public class testmobile {

	public static void main(String[] args) {

		mobile m = new mobile();

		m.setName("vivo v 23");
		System.out.println("model= " + m.getName());
		m.setPrice(40000);
		System.out.println("price= " + m.getPrice());
		m.setRam("8 gb");
		System.out.println("Ram= " + m.getRam());
		m.setRom("128 gb");
		System.out.println("Rom= " + m.getRom());
		m.setNetwork("5g");
		System.out.println("Ntype= " + m.getNetwork());
		m.setBettary("5000mh");
		System.out.println("bettary= " + m.getBettary());
		m.discount(5000);
		System.out.println("After Disc = " + m.getPrice());
	    m.gst(2500);
	    System.out.println("After gst = " + m.getPrice());
	    
		
		
		
		
		
		

	}

}

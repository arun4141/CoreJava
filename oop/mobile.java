package com.rays.oop;

public class mobile {

	private String name;
	private String ram;
	private String rom;
	private String bettary;
	private String network;
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getBettary() {
		return bettary;
	}

	public void setBettary(String bettary) {
		this.bettary = bettary;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public void discount(int d) {
		
		setPrice( getPrice() - d);
}
	public void gst (int t) {
		
		setPrice( getPrice() + t);
	
		
		
	}
	

}

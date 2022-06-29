package com.rays.oop;

public class rectangle extends shape {
private int len;
private int wid;

public rectangle() {}

public rectangle(int l, int w) {
	len=l;
	wid=w;
}
public void area() {
	double area = len*wid;
	System.out.println(area);
}
}

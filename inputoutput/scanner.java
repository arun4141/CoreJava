package inputoutput;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1 valu");
		//String a = sc.nextLine();
	  // String a = sc.next();
		//Double a = sc.nextDouble();
		int a = sc.nextInt();
		System.out.println("enter 2 valu");
		//String b = sc.nextLine();
		// String b = sc.next();
	//	Double b = sc.nextDouble();
		int b = sc.nextInt();
		System.out.println("enter 3 valu");
		//String c = sc.nextLine();
		// String c= sc.next();
		//Double c = sc.nextDouble();
		int c = sc.nextInt();
		
		int  d = a+b+ c;
		System.out.println(d);
	}

}

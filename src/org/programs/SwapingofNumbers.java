package org.programs;

import java.util.Scanner;

public class SwapingofNumbers {
	public static void main(String []args) {
	Scanner s =  new Scanner(System.in);
	int a = 40, b = 50;
	System.out.println(a);
	System.out.println(b);
//	System.out.println("Enter the Name");
//	String i = s.nextLine(); 
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("********************");
	int c = 300, d = 800, e = 0;
	System.out.println(c);
	System.out.println(d);

	e = c;
	c = d;
	d = e;
	System.out.println(c);
	System.out.println(d);
	
	
	}
}

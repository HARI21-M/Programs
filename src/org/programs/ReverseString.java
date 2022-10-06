package org.programs;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Name");
	String f = s.nextLine();
	String rev = "";
	for (int i =(f.length()-1); i >= 0 ; i--) {
		char c = f.charAt(i);
		rev = rev +c;
	}System.out.println(rev);
	}
}

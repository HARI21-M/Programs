package org.programs;

import java.util.Scanner;

public class PandilromeString {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Name");
	String f = s.nextLine();
	String rev = "";
	for (int i =(f.length()-1); i >= 0 ; i--) {
		char c = f.charAt(i);
		rev = rev +c;
	}if (rev.equals(f)) {
		System.out.println("Enter name is Pandilrome");
	} else {
		System.out.println("Enter name is NotPandilrome");
	}
	}

}

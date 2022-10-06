package org.programs;

public class StringOccurance {
	public static void main (String[] args) {
	String s = "Melwire Rolling Pvt. Ltd.";
	int upper = 0, lower = 0, digit = 0, special = 0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		
		if (Character.isUpperCase(c)) {
			upper++;
		}else if (Character.isLowerCase(c)) {
			lower++;
		}else if (Character.isDigit(c)) {
			digit++;
		}
		else {
			special++;
		}
	}
	System.out.println(upper);
	System.out.println(lower);
	System.out.println(digit);
	System.out.println(special);
	}
}

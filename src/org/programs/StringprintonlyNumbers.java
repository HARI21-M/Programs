package org.programs;

public class StringprintonlyNumbers {
	public static void main(String[] args) {
		String s = "728643s ndk jA G F%";
		int d = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				
				System.out.print(c+" ");
			}
			
		}

	}
}

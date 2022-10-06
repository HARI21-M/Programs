package org.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int i = 0, j = 0, a = 0;
		System.out.println("Enter the Number to reversed");
		int num = s.nextInt();
		a = num;
		while (a>0) {
			i = (a%10);
			j = ((j*10)+i);
			a = (a/10);
			}
		System.out.println(j);
	}
	
	
	
}

package org.programs;

import java.util.Scanner;

public class SumofGivenNumber {
	
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int i = 0, j = 0, a = 0;
		System.out.println("Sum the Given Number");
		int num = s.nextInt();
		a = num;
		while (a>0) {
			i = (a%10);
			j = (j+i);
			a = (a/10);
			}
		System.out.println(j);
		
	}
	
	

}

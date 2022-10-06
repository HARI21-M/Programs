package org.programs;

import java.util.Scanner;

public class PandilromeNumber {
	
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int i = 0, j = 0, a = 0;
		System.out.println("Enter the Number");
		int num = s.nextInt();
		a = num;
		while (a>0) {
			i = (a%10);
			j = ((j*10)+i);
			a = (a/10);
			}
		if (num==j) {
			System.out.println("Entered Number is Pandilrome Number");
			
		}else {
			System.out.println("Entered Number is Not Pandilrome Number");
		}
		
	}
	
	

}

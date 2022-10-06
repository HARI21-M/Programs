package org.programs;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int i = 0, j = 0, a = 0;
		System.out.println("Enter the Number");
		int num = s.nextInt();
		a = num;
		while (a>0) {
			i = (a%10);
			j = ((i*i*i)+j);
			a = (a/10);
			}
		if (num==j) {
			System.out.println("Entered Number is Amstrong Number");
			
		}else {
			System.out.println("Entered Number is NotAmstrong Number");
		}
	}
	}

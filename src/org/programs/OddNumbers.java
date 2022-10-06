package org.programs;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {

		//Sum of odd Number
		int c = 0;
		for (int j = 1; j < 100; j++) {
			if(j%2==1) {
				c = (c+j);
			}
		}System.out.println("Sum of OddNumber between 1 to 100 = " + c);


		//Count of odd Number:
		Scanner s = new Scanner(System.in);
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if(i%2==1) {
				count = (count+1);
			}
		}System.out.println("Count of OddNumber between 1 to 100 = " + count);

		// Printing Odd Number between 1 to 100
		System.out.println("odd numbers between 1 t0 100 :");
		for (int k = 1; k < 100; k++) {
			if(k%2==1) {
				System.out.println(k);
			}
		}

	}


}
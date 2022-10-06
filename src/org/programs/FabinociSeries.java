package org.programs;

import java.util.Scanner;

public class FabinociSeries {
	
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = 0, b = 1;
	for (int i = 0; i < 6; i++) {
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c;
	}
	}
}

package org.programs;

public class PrimeNumber {
	public static void main(String[] args) {
		int c =0;
		for (int i = 1; i <= 50; i++) {
			int count = 0; 
			for (int j = 2; j <=i/2; j++) {
				if (i%j==0) {
					count++;
					
				}
			}if (count==0) {
				c++;
			}
			
		}
		System.out.println("count of prime Number(1-50) = "+c);
		
		System.out.println("Prime Numbers (1-50):");
		for (int u = 1; u <= 50; u++) {
			int count1 = 0;
			for (int j = 2; j <=u/2; j++) {
				if (u%j==0) {
					count1++;
					
				}
			}if (count1==0) {
				
				System.out.println(u);
			}
			
		}
		
		int num = 85;
		int y = 0;
		for (int k = 2; k <=num/2; k++) {
			if(num%k==0) {
				y = 1;
			}
		}	
			if (y==0) {
					
				
				System.out.println("prime Number");
				
			}else {
				System.out.println(num+" - Given number is not prime number");
			}
			
		}
	}



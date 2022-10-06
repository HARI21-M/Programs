package org.programs;

public class ArrayAscendingandDescending {
	public static void main(String[] args) {
	
		int v[] = {12,8,316,564,354,30,10,45};
		int l = v.length;
//		System.out.println(":"+l);
		for (int i = 0; i < l; i++) {
			for (int j = i+1; j < l; j++) {
				int c = 0;
				if (v[i]<v[j]) {
					c = v[i];
					v[i]=v[j];
					v[j]=c;
				}
			}
		}
		for (int k = 0; k <l; k++) {
			System.out.print(v[k]+",");
		}
		System.out.println("Maximum Number = "+v[0]);
	}	
	}
//		int n, temp;
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter no. of elements you want in array:");
//		n = s.nextInt();
//		int a[] = new int[n];
//		System.out.println("Enter all the elements:");
//		for (int i = 0; i < n; i++) {
//		a[i] = s.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//		for (int j = i + 1; j < n; j++) {
//		if (a[i] > a[j]) {
//		temp = a[i];
//		a[i] = a[j];
//		a[j] = temp;
//		}
//		}
//		}
//		System.out.print("Descending Order:");
//		for (int i = n - 1; i > 0; i--) {
//		System.out.print(a[i] + ",");
//		}
//		System.out.print(a[0]);
//		}
//		}
//	 



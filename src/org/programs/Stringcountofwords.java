package org.programs;

public class Stringcountofwords {
	public static void main(String[] args) {
		
	    String s = "hi hi hello hello i am json lkgfj kjsdhf";
	    int count = 1;
	    for (int i=0; i<s.length(); i++) {
	        char c = s.charAt(i);
	        if (c==' ' && c+1!=' ') {
	            count++;
	        }
	    }
	    
	  System.out.println(count);
	}
	}

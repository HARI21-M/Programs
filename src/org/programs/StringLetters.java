package org.programs;

public class StringLetters {

	public static void main(String[] args) {
		// to first character from string as capital
		String a = "melwa";
		String s = a.substring(0, 1);
		String u = s.toUpperCase();
		String f = a.substring(1);
		System.out.println(u+f);

		
		// to remove duplicate character from string	
		String h = "jdsflkjsadfl";
		String i = "";

		for (int j = 0; j < h.length(); j++) {
			char c = h.charAt(j);
			if (i.indexOf(c)<0) {
				i = i+c;
			}
		} 
		System.out.println(i);

		
		// to remove duplicate word from string
		String o = "Hi Hello Welcome to Welcome to";
		String t = "";
		String e [] ;
		e = o.split(" ");
		for (int j = 0; j < e.length; j++) {
			for (int j2 = j+1; j2 < e.length; j2++) {
				if (e[j].equals(e[j2])) {
					e[j2]="remove";

				}
			}
		}
		for (String q : e) {
			if(q!="remove") {
				t = t + q + " ";
			}
			
		}
		System.out.println(t);	
	}
}

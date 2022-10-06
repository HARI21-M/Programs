package org.programs;

public class StringVowels {
	public static void main(String[] args) {
		
	
	String s ="melwire Rolling Pvt. Ltd.";
	
	int vowels =0, nonvowels=0, count=0;
	
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' ||c=='i' || c=='o' || c=='O' || c=='u' || c=='U') {
			vowels++;
		
	}else {nonvowels++;
	}
	}
	System.out.println(vowels);
	System.out.println(nonvowels);



  String k = "aaaabbccAAdd";
  char j = 'd';            // Character to search is 'a'.
  

  for(int i=0; i<k.length(); i++)
  {
      if(k.charAt(i) == j)
      count++;
  }
  
  System.out.println("The Character '"+j+"' appears "+count+" times.");
  }

}
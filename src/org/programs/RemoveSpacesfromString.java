package org.programs;

public class RemoveSpacesfromString {
	public static void main(String[] args) {

		String str1 = "Saket Saurav        is a QualityAna    list";

		//1. remove spaces Using replaceAll() Method

		String str2 = str1.replaceAll("\\s", "");

		System.out.println(str2);

		//2. remove spaces withoutreplaceAll() Method..
	     String str3 = "Saket Saurav        is an Autom ation Engi ne      er";
	     
	        char[] chars = str3.toCharArray();
	  
	        StringBuffer sb = new StringBuffer();
	  
	        for (int i = 0; i <chars.length; i++)
	        {
	            if( (chars[i] != ' ') && (chars[i] != '\t') )
	            {
	                sb.append(chars[i]);
	            }
	        } 
	        System.out.println(sb); 
	}
}



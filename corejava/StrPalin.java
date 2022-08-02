package corejava;

import java.util.Scanner;

public class StrPalin {

	public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String str= sc.next();
		
		String rev="";
		int len=str.length();
		
		//To find the whether the given  String is Palindrome or not
		
	    for(len=len-1;len>=0;len--)
	          rev = rev +str.charAt(len);
		 
		if(str.equals(rev))
				System.out.println("Given string is a Palindrome");
		else
				System.out.println("Given String is not a palindrome");
		
	}
	}



	

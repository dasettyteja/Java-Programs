package corejava;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String str= sc.next();
		
		String rev="";
		int len=str.length()-1;
		
		//To find the reverse of a String 
		
		/*  using for loop
		 for(len=len-1;len>=0;len--)
	          rev = rev +str.charAt(len); */
		
		
	      while(len>=0)
	      {
	    	  rev=rev+str.charAt(len);
	    	  len--;
	      }
	      	    	  
			System.out.println("Reverse of a string is: "+ rev);
	}
	}



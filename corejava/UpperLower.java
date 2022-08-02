package corejava;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter an alphabet");
	  char c= sc.next().charAt(0);
	  
	  
	  if(c>=65 && c<=90) 
		  System.out.println("Alphabet is in Upper Case = "+c );
	  else
		  System.out.println("Alphabet is in Lower Case = "+c );

	  
	}

}

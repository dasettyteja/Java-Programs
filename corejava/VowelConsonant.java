package corejava;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner sc = new Scanner(System.in);
		     
		 System.out.println("Enter an Alphabet:");
		 char c=sc.next().charAt(0);
		
		 //To find whether the given alphabet is vowel or consonant
		 switch(c)
		 {  
		 case 'a': 
		 case 'A':
		 case 'e': 
		 case 'E':
		 case 'i': 
		 case 'I':
		 case 'o': 
		 case 'O':
		 case 'u': 
		 case 'U':
		           System.out.println(c+" is a Vowel");
		           break;
		 default:
			       System.out.println(c+" is a Consonant");
		 }
		
		
		    
	}

}

package corejava;

import java.util.Scanner;

public class SwitchCa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( "Arithmetic Operations \n 1. Addition \n 2.Substraction \n 3.Multiplicatoin \n 4.Division");
		System.out.println("Enter your Choice:");
		int choice =sc.nextInt();
		
		System.out.println("Enter any two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		switch(choice)
		{
			case 1: 
				     System.out.println("Addition of two numbers is: "+(a+b)); 
			         break;
			
			case 2: 
				      System.out.println("Substraction of two numbers is: "+(a-b)); 
	                 break;
	         
			case 3:
				    
				      System.out.println("Multiplication of two numbers is: "+(a*b)); 
                     break;
            
			case 4: 
				     System.out.println("Division of two numbers is: "+(a/b)); 
                     break;
            
            default: 
            	System.out.println("Invalid Choice!!");
	                 break;
	                 
		}
		
	}

}

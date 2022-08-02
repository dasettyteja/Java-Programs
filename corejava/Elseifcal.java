package corejava;

import java.util.Scanner;

public class Elseifcal {

	public static void main(String[] args) {
		
		
          Scanner sc=new Scanner(System.in);
		
		System.out.println( "Arithmetic Operations \n 1. Addition \n 2.Substraction \n 3.Multiplicatoin \n 4.Division");
		System.out.println("Enter your Choice: 1/2/3/4");
		int choice =sc.nextInt();
		
		
		if(choice<=4)
		{
			
			System.out.println("Enter any two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
		if(choice==1)
			System.out.println("Addition of two numbers is: "+(a+b)); 
		else if(choice==2)
			System.out.println("Substraction of two numbers is: "+(a-b)); 
		else if(choice==3)
			System.out.println("Multiplication of two numbers is: "+(a*b)); 
		else if(choice==4)
			System.out.println("Division of two numbers is: "+(a/b));
		

	}else
		System.out.println("Invalid Choice!!");

}
}

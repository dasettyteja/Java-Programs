package corejava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter a number: ");
		int a =sc.nextInt();
		
		// To find even or odd
		
		if(a%2==0)
			System.out.println(a +" is Even number");
		else
		     System.out.println(a+" is Odd number");
		   
	}

}

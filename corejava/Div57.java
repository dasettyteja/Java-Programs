package corejava;

import java.util.Scanner;

public class Div57 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// to check whether a given number is divisible by 5&7 or not
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		
		// to check whether a given number is divisible by 5&7 or not
		
		if(a% 5==0 && a%7==0)
			System.out.println(a+" is divisible by 5 & 7");
		else
			
			System.out.println(a+" is not  divisible by 5 & 7");
	}

}

package corejava;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factors");
		int num =sc.nextInt();
		
		int i=1;
		System.out.println("Factors of a given number is ");
		while(i<=num)
		{
			 if(num%i==0)
				 System.out.println(i);
			 i++;
		}
	}

}


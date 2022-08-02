package corejava;

import java.util.Scanner;

public class Factoial {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number to find a Factorial:");
		int n = sc.nextInt();
		int f=1,i=1;
		while(i<=n)
		{
			f=f*i;
			i++;
		}
       System.out.println("Factorial of a number is " +f);
	}

}

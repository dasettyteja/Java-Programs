package corejava;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char a=sc.next().charAt(0);
		
		if(a>=48 && a<=57)
			System.out.println(" You Entered Character is a  Digit ");
		else
			System.out.println(" You Entered Character is not a  Digit ");

	}

}

package corejava;

import java.util.Scanner;

public class Alphabet1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char c =sc.next().charAt(0);
		
		//if(c>=65 && c<=122)
			if(c>='A' && c<='z')
			System.out.println(c+"  is an alphabet");
		else
			System.out.println(c+ " is not an alphabet");
			
		

	}

}

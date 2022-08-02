package corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		  
		  System.out.println("Enter a number:");
		  int num=sc.nextInt();
		  
		  //To find the whether the given number is Palindrome or not
		  int rem=0;int rev=0;
		  int temp=num;
		  while(num>0)
		  { 
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		  }
		  
		  if(temp==rev)
			  System.out.println("Given number is a Palindrome");
		  else
			  System.out.println("Given number is not a Palindrome");
		  
	}

}

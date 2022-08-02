package corejava;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  
  //To find the reverse of a number
  int rem=0;int rev=0;
  
  while(num>0)
  { 
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	
  }
  
  System.out.println("Reverse of a number is   "+rev);
  }

}

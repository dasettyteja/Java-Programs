package corejava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num = sc.nextInt();
		
		//To find Whether the given number is Armstrong number or not
		
		int rem=0; int arm=0;
		int temp=num;
		while(num>0)
		{
		
		rem=num%10;
		arm=arm+rem*rem*rem;
		num=num/10;
				
	    }
		
		if(temp==arm)
		System.out.println("Given number is  an Armstromg number");
		else
			System.out.println("Give number is not an Armstrong number");

}
}

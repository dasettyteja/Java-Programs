package corejava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Ente a Year:");
	    int year= sc.nextInt();
	    
	    // to find leap year or not
	    
	    if(year%4==0&&year%100!=0)
	    	System.out.println(year+" is a leap year");
	    else if(year%400==0)
	    	System.out.println(year+" Is a leap year");
	    else
	    	System.out.println(year+" is not a leap year");
	    
		
	}

}

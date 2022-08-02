package corejava;

import java.util.Scanner;

public class Big2no {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Two numbers:");
     int a =sc.nextInt();
     int b= sc.nextInt();
     
     // Biggest among two numbers
     
     if(a>b)
         System.out.println(a+" is bigger number &" + b+ "is smaller");
     else
    	 System.out.println(b+" is bigger number & " +a+" is smaller");
     
	}

}

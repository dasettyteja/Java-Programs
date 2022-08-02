package corejava;

import java.util.Scanner;

public class StudGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Student Name:");
		 String name = sc.next();
		 System.out.println("Enter Student Id");
		 int id = sc.nextInt();
		 System.out.println("Enter Student Marks m1,m2,m3");
		 int m1= sc.nextInt();
		 int m2 = sc.nextInt();
		 int m3= sc.nextInt();
		 
		 int total=m1+m2+m3;
		 double avg = (double)total/3;
		  // To find the student  grade
		 if(m1>=40 && m2>=40 && m3>=40)
		 {
		       if(avg>=95)
		    	   System.out.println("You got 'O' grade");
		       else if(avg>=85 && avg<=95)
		    	   System.out.println("Yo got A+ grade");
		       else if(avg>=75 && avg<=85)
		    	   System.out.println("You got A grade");
		       else if(avg>=65 && avg<=75)
		    	   System.out.println("You got B+ grade");
		       else if(avg>=55 && avg<=65)
		    	   System.out.println("You got B grade");
		       else if(avg>=40 && avg<=55)
		    	   System.out.println("You got C grade");		 	
		 }
		 else
	     	   System.out.println(" Sorry you got Failed ");

	}

}
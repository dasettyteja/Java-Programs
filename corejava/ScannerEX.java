package corejava;
import java.util.*;
public class ScannerEX {

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Student Name:");
		 String name = sc.next();
		 System.out.println("Enter Student Id");
		 int id = sc.nextInt();
		 System.out.println("Enter Student Marks m1,m2,m3");
		 int m1= sc.nextInt();
		 int m2 = sc.nextInt();
		 int m3= sc.nextInt();
		 int total = m1+m2+m3;
		 double avg=(double)total/3;
		 
		 
		 System.out.println(" Student Name is :"+name);
		 System.out.println(" Student id:"+id);
		 System.out.println(" Student Marks is \n m1 = " +m1);
		 System.out.println(" m2 = " +m2);
		 System.out.println(" m3 = " +m3);
		 System.out.println(" Total = " +total);
		 System.out.println(" Avg ="+avg);
		 

	}

}

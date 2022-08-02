package corejava;

import java.util.Scanner;

public class Oppositecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter an alphabet");
	  char c= sc.next().charAt(0);
	  int a;
	  
	  if(c>=65 && c<=90) 
		  a=c+32;
	  else
		  a=c-32;
	  c=(char)a;
	  System.out.println("alphabet in opposite case is "+c);
}
}
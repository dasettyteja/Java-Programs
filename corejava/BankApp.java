package corejava;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Banking Application");
		System.out.println(" Our Operations");
		System.out.println(" select 1. To Exit From the System");
		System.out.println(" Select 2. To transfer Money");
		System.out.println(" Select 3.To withdraw Money");
		
		int  operation= sc.nextInt();
	
		if(operation==1) {
			System.out.println("Exixting from the system");
		}else if(operation==2){
			System.out.println("How much money do you have???");
			int  balance=sc.nextInt();
			System.out.println("How much money do you want to transfer ???");
			int transfer = sc.nextInt();
			
			if(balance>transfer) {
			System.out.println("Money got Transfered....");
			System.out.println("Your balance is"+(balance-transfer));
			
		       }else if(balance<transfer) {
		 System.out.println("Insufficinet Balace");

	       }else if(balance==transfer) {
		System.out.println(" Total Money got Transfered....");
		System.out.println("Your balance is"+(balance-transfer));
           }
		}else if(operation ==3) {
			System.out.println("Enter your balance");
			int balance=sc.nextInt();
			System.out.println("Enter how much money you want to withdraw");
			int withdraw=sc.nextInt();
			
			if(balance>withdraw) {
				System.out.println("You got  withdraw your money");
				
			}else if(balance<withdraw) {
		System.out.println("Your Balance is insufficient");
			
		}else if(balance==withdraw) {
			System.out.println("You got  withdraw  all of your money");
		}
		}else {
			System.out.println("Invalid Operation");
		}
}
}
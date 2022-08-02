package corejava;

import java.util.Scanner;

public class BankAppWhile {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Banking Application");
		System.out.println(" Our Operations");
		System.out.println(" select 1. To transfer Money");
		System.out.println(" Select 2. To put Money");
		System.out.println(" Select 3.To withdraw Money");
		
		int  operation= sc.nextInt();

		  while(true) {
			   if(operation==1){
					System.out.println("How much money do you have???");
					int  balance=sc.nextInt();
					System.out.println("How much money do you want to transfer ???");
					int transfer = sc.nextInt();
					
					if(balance>=transfer) {
					System.out.println("Money got Transfered....");
					System.out.println("Your balance is"+(balance-transfer));
					
				       }else {
				 System.out.println("Insufficinet Balace");

			       }
		    }
	}
	}
}



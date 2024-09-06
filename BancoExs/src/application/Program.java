package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.print("Enter account holder:");
		String holder = sc.nextLine();
		System.out.println();
		System.out.println("Is there a initial deposit (y/n)?");
		char initialDeposit = sc.next().charAt(0);
		if(initialDeposit == 'y') {
			System.out.print("Enter inital deposit value: ");
			double deposit = sc.nextDouble();
			account = new Account(holder, number, deposit);
		} else {
			account = new Account(holder, number);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updatede account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updatede account data:");
		System.out.println(account);
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		System.out.print("Is there na initial deposit (Y/N): ");
		char confirma = sc.next().charAt(0);
		
		Account account;
		
		
		if(confirma =='y') {
			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
			
		System.out.print("Enter a deposit value");
		double depositar = sc.nextDouble();
		account.depositar(depositar);
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.print("Enter com retirada value: ");
		double retirar = sc.nextDouble();
		account.retirar(retirar);
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		
		sc.close();
		

	}

}

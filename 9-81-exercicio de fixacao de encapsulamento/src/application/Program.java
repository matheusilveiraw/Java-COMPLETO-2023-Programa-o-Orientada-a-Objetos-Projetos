package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		String accHolder = sc.next();
		System.out.println("Is there a initial deposit? (Y/N)");
		char initialDeposit = sc.next().charAt(0); ///tem que usar o char at aqui 
		System.out.println("Enter initial deposit value: ");
		double initialDepositValue = sc.nextDouble();
		
		System.out.println(accNumber + " " + accHolder + " " + initialDeposit + " " + initialDepositValue);
				
		sc.close();
	}

}

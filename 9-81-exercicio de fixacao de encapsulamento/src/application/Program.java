package application;

import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double initialDepositValue = 0;
		char initialDepositPermission;
		String accHolder;
		int accNumber;
						
		System.out.println("Enter account number: ");
		accNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		accHolder = sc.next();
		System.out.println("Is there a initial deposit? (Y/N)");
		initialDepositPermission = sc.next().charAt(0);
		if(initialDepositPermission == 'Y') {
			System.out.println("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
		}
		
		Conta conta = new Conta(accNumber, accHolder, initialDepositValue);
		
		System.out.println("Holder: " + conta.getAccHolder() + ", Acc: "+ conta.getAccNumber() + ",  Balance: R$" + conta.getTotalValue());
		
		System.out.println("Enter a deposit value: ");
		initialDepositValue = sc.nextDouble();
		conta.deposito(initialDepositValue);
		
		System.out.println("Holder: " + conta.getAccHolder() + ", Acc: "+ conta.getAccNumber() + ",  Balance: R$" + conta.getTotalValue());

		
		System.out.println("Enter a withdraw value: ");
		initialDepositValue = sc.nextDouble();
		conta.saque(initialDepositValue);
		
		System.out.println("Holder: " + conta.getAccHolder() + ", Acc: "+ conta.getAccNumber() + ",  Balance: R$" + conta.getTotalValue());
				
		sc.close();
	}

}

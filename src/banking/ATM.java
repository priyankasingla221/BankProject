package banking;

import java.util.Scanner;

public class ATM extends Bankingrules implements StandardProcess {
	Scanner sc = new Scanner(System.in);

	public ATM(int pin) {
		super(pin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double depositmoney) {
		// TODO Auto-generated method stub
		accountBalance = accountBalance +depositmoney;
		System.out.println("New balance after Deposit:  " +accountBalance);
		System.out.println("Would you like to make another Deposit?");
		String userEntry = sc.next();
		if(userEntry.equalsIgnoreCase("yes")) {
			System.out.println("Enter How much you would like to deposit: ");
			Double depositMoney = sc.nextDouble();
			accountBalance = accountBalance+depositMoney;
			System.out.println("Updated balance: " +accountBalance);
			 
			}else {
				System.out.println("***********Thank you for Choosing Scocia Bank***********");
			}
	}

	@Override
	public void withdraw(double withdrawmoney) {
		// TODO Auto-generated method stub
		
		if (accountBalance > withdrawmoney) {
			accountBalance = accountBalance - withdrawmoney;
			System.out.println("New balance after withdrawl: " + accountBalance);
			System.out.println("Would you like to make another Withdrawal?");
			String userEntry = sc.next();
			if (userEntry.equalsIgnoreCase("yes")) {
				System.out.println("Enter How much you would like to withdraw: ");
				Double withdrawMoney = sc.nextDouble();
				accountBalance = accountBalance - withdrawMoney;

				System.out.println("Updated balance: " + accountBalance);
			} else {
				System.out.println("***********Thank you for Choosing Scocia Bank***********");
			}

		} else {
			System.out.println("Insufficiant Funds!");
		}
	}

	@Override
	public void fundTransfer() {
		// TODO Auto-generated method stub
		System.out.println("Would you like to do Fund transfer?");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println();

	}

	@Override
	public boolean useridentifcation() {
		if (this.pin == 1234) {
			return true;
		}else {
		System.out.println("LOGIN UNSUCCESSFUL");
		}
		return false;
		

	}

}

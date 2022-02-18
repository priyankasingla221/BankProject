package banking;

import java.util.Scanner;

public class OnlineBanking extends Bankingrules implements StandardProcess {
	Scanner sc = new Scanner(System.in);

	public OnlineBanking(int pin) {
		super(pin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double depositmoney) {
		// TODO Auto-generated method stub
		accountBalance = accountBalance + depositmoney;
		System.out.println("New balance after e-Transfer Deposit:  " + accountBalance);
		System.out.println("Would you like to make another deposit?");
		String userEntry = sc.next();
		if (userEntry.equalsIgnoreCase("yes")) {
			System.out.println("Enter How much you would like to Deposit: ");
			Double depositMoney = sc.nextDouble();
			accountBalance = accountBalance + depositMoney;
			System.out.println("Updated balance: " + accountBalance);
		} else {
			System.out.println("***********Thank you for Choosing Scocia Bank***********");
		}
	}

	@Override
	public void withdraw(double withdrawmoney) {
		// TODO Auto-generated method stub
		if (accountBalance > withdrawmoney) {
			accountBalance = accountBalance - withdrawmoney;
			System.out.println("New balance after e-Transfer withdrawl: " + accountBalance);
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

	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean useridentifcation() {
		
		//for (int count = 0; count < 3; count++) {
			if ((this.pin == 4321)) {
			
				return true;
			} else {
				System.out.println("LOGIN UNSUCCESSFUL!");
			}
		return false;

	}
}

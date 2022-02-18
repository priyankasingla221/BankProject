package banking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PersonDetails details = new PersonDetails();

		// Asking user which type of banking they would like to do.
		System.out.println("***************Welcome to Scocia Bank**************" + "\n"
				+ "Please Enter what type of banking you would like to do today?" + "\n" + "ATM or Online");
		String userSelection = sc.next();

		if (userSelection.equalsIgnoreCase("ATM")) {
			System.out.println("~~~~~~~~~~~~Welcome to ATM services~~~~~~~~~~~~~");
			ATM atm = new ATM(0);

			// Validation PIN
			System.out.println("Enter 4 digit pin for ATM");
			atm.pin = sc.nextInt();
			atm.useridentifcation();
			
			if (atm.useridentifcation() == true) {
				System.out.println("Please wait..." + "\n" + "LOGIN SUCCESSFUL");
				// Displaying user details
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" + "Account Number: "
						+ details.getAccountOwnerAccountNo() + "\n" + "Account Holder: " + details.getAccountOwnerName()
						+ "\n" + "Account Type:  " + details.getAccountType() + "\n" + "Current Balance:  "
						+ details.getTotalFunds());

				// taking Input if they want to withdraw or deposit
				System.out.println("ATM services: Would you like withdraw or deposit?");
				String selection = sc.next();

				if (selection.equalsIgnoreCase("deposit")) {
					// Deposit working starts
					System.out.println("Enter How much you would like to deposit: ");
					double depositMoney = sc.nextDouble();
					atm.deposit(depositMoney);

				} else if (selection.equalsIgnoreCase("withdraw")) {
					// Withdraw Working starts
					System.out.println("Enter How much you would like to withdraw: ");
					Double withdrawMoney = sc.nextDouble();
					atm.withdraw(withdrawMoney);

				} else {
					System.out.println("Invalid Enter!");
				}
			}
		}

		else if (userSelection.equalsIgnoreCase("Online")) {
			System.out.println("~~~~~~~~~~Welcome to Online Banking services~~~~~~~~~~");
			OnlineBanking online = new OnlineBanking(0);

			// Validating user PIN
			System.out.println("Please enter 4 digit PIN for Online Banking: ");
			online.pin = sc.nextInt();
			//online.useridentifcation();

			if (online.useridentifcation() == true) {
				System.out.println("Please wait..." + "\n" + "LOGIN SUCCESSFUL");
				// Displaying User Details
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" + "Account Number: "
						+ details.getAccountOwnerAccountNo() + "\n" + "Account Holder: " + details.getAccountOwnerName()
						+ "\n" + "Account Type:  " + details.getAccountType() + "\n" + "Current Balance:  "
						+ details.getTotalFunds());

				// taking Input if they want to withdraw or deposit
				System.out.println("E-Transfer Services: Would you like withdraw or deposit?");
				String selection = sc.next();
				if (selection.equalsIgnoreCase("deposit")) {
					// deposit working starts here
					System.out.println("Enter How much you would like to deposit: ");
					double depositMoney = sc.nextDouble();
					online.deposit(depositMoney);

				} else if (selection.equalsIgnoreCase("withdraw")) {
					// Withdraw working starts here
					System.out.println("Enter How much you would like to withdraw: ");
					Double withdrawMoney = sc.nextDouble();
					online.withdraw(withdrawMoney);

				} else {
					System.out.println("Invalid Enter!");
				}

			}
		}

		else {
			System.out.println("Invalid Entry! Please Enter Valid Banking Option.");
		}
	}

}

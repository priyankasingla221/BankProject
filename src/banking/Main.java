package banking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quit= "yes";
		Scanner sc = new Scanner(System.in);
		PersonDetails details = new PersonDetails();
		
		
		// Asking user which type of banking they would like to do.
		System.out.println("***************Welcome to Scotia Bank**************" + "\n"
				+ "Please Enter what type of banking you would like to do today?" + "\n" + "ATM or Online");
		String userSelection = sc.next();

		if (userSelection.equalsIgnoreCase("ATM")) {
			System.out.println("~~~~~~~~~~~~Welcome to ATM services~~~~~~~~~~~~~");
			ATM atm = new ATM(0);

			// Validation PIN
			
			//atm.useridentifcation();
			if (atm.useridentifcation() == true) {
				System.out.println("Please wait..." + "\n" + "LOGIN SUCCESSFUL");
				// Displaying user details
				
			
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" + "Account Number: "
						+ details.getAccountOwnerAccountNo() + "\n" + "Account Holder: " + details.getAccountOwnerName()
						+ "\n" + "Account Type:  " + details.getAccountType() + "\n" + "Current Balance:  "
						+ details.getTotalFunds());

				// taking Input if they want to withdraw or deposit
				while(quit.equalsIgnoreCase("yes")) {
				System.out.println("ATM services:  What Would you like to do ? " +"\n" +"1 Deposit" +"\n" +"2 Withdraw" +"\n"+ "3 Transferfunds" +"\n"+"4 Investment" +"\n" + "5 Change Pin " +"\n"+ "6 Exit");
				int  selection = sc.nextInt();
				switch(selection) {
				case 1 :
				{
					System.out.println("Enter How much you would like to Deposit: ");
					double depositMoney = sc.nextDouble();
					atm.deposit(depositMoney);
					break;
				
				}
				case 2:
				{
					System.out.println("Enter How much you would like to Withdraw: ");
					double withdrawMoney = sc.nextDouble();
					atm.withdraw(withdrawMoney);
					break;
				}
				case 3 :{
					System.out.println("How much you would like to Transfer?");
					double transferfunds = sc.nextDouble();
					atm.fundTransfer(transferfunds);
					break;
				}
				case 4:{
					
					System.out.println("How much you would like to Invest?");
					double investment = sc.nextDouble();
					atm.investment(investment);
					break;
				}
				case 5 :{
					System.out.println("Please Enter new 4 digit PIN: ");
					int pin = sc.nextInt();
					atm.pinChange(pin);
					
					break;
					
				}
				case 6:{
					System.out.println("Exiting the application! GoodBye!");
					System.exit(0);
				}
				default:{
					System.out.println("Invalid Enter!");
				}
				
				} 
				System.out.println("Would you like to go Back to Main menu? yes/no");
				String input = sc.next();
				quit =input;
				}
				 System.out.println("***********Have a Good Day!***********" +"\n" +"\"***********Thank you for Choosing Scotia Bank***********\"");
				
		}
			}

		else if (userSelection.equalsIgnoreCase("Online")) {
			System.out.println("~~~~~~~~~~Welcome to Online Banking services~~~~~~~~~~");
			OnlineBanking online = new OnlineBanking(0);

			// Validating user PIN
			

			if (online.useridentifcation() == true) {
				System.out.println("Please wait..." + "\n" + "LOGIN SUCCESSFUL");
				// Displaying User Details
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" + "Account Number: "
						+ details.getAccountOwnerAccountNo() + "\n" + "Account Holder: " + details.getAccountOwnerName()
						+ "\n" + "Account Type:  " + details.getAccountType() + "\n" + "Current Balance:  "
						+ details.getTotalFunds());
				while(quit.equalsIgnoreCase("yes")) {
				// taking Input if they want to withdraw or deposit
				System.out.println("E-Transfer Services: What Would you like to do ?" +"\n"+ "1 Deposit"+"\n" +"2 Withdraw "+"\n"+ "3 Transferfunds" +"\n"+"4 Investment" +"\n" +"5 Pin change" +"\n" +"6 Exit");
				int selection = sc.nextInt();
				
				switch(selection) {
				case 1:{
					// deposit working starts here
					System.out.println("Enter How much you would like to Deposit: ");
					double depositMoney = sc.nextDouble();
					online.deposit(depositMoney);
					break;
				}
					
				
				case 2:{
					// Withdraw working starts here
					System.out.println("Enter How much you would like to Withdraw: ");
					Double withdrawMoney = sc.nextDouble();
					online.withdraw(withdrawMoney);
					break;
					
				}
				case 3 : {
					//Transfer funds working starts here
					System.out.println("How much you would like to Transfer?");
					double transferfunds = sc.nextDouble();
					online.fundTransfer(transferfunds);
					break;
				}
				case 4: {
					//Investment working Starts here
					System.out.println("How much you would like to Invest?");
					double investment = sc.nextDouble();
					online.investment(investment);
					break;
				}
				case 5 :{
					System.out.println("Please Enter new 4 digit PIN: ");
					int pin = sc.nextInt();
					online.pinChange(pin);
					break;
					
				}
				case 6: {
					System.out.println("Exiting the application! GoodBye!");
					System.exit(0);
					break;
				}
				case 7:{
					System.out.println("Invalid Enter!");
				}
					
				}
				System.out.println("Would you like to go Back to Main menu? yes/no" );
				String input = sc.next();
				quit =input;
				}System.out.println("***********Have a Good Day!***********" +"\n"+"***********Thank you for Choosing Scotia Bank***********");
				}
			
		}

		else {
			System.out.println("Invalid Entry! Please Enter Valid Banking Option.");
		}
	}

}

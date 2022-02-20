package banking;

import java.util.Scanner;

public class OnlineBanking extends Bankingrules implements StandardProcess {
	Scanner sc = new Scanner(System.in);
	
	int temporarypin =4321 ;
	int totalattempt =3;

	public OnlineBanking(int pin) {
		super(pin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double depositmoney) {
		// TODO Auto-generated method stub
		accountBalance = accountBalance + depositmoney;
		System.out.println("New balance after e-Transfer Deposit:  " + accountBalance);
		
		while(noOftransectionsallowded!=0) {
			
			System.out.println("Transections Left: "+noOftransectionsallowded +"\n"+"Would you like to make another Deposit?");
			String userEntry = sc.next();
		
		if (userEntry.equalsIgnoreCase("yes")) {
			System.out.println("Enter How much you would like to Deposit: ");
			Double depositMoney = sc.nextDouble();
			accountBalance = accountBalance + depositMoney;
			System.out.println("Updated balance: " + accountBalance);
			noOftransectionsallowded--;
		} else {
			System.out.println("***********Thank you for Choosing Scotia Bank***********");
			break;
		}}
		if(noOftransectionsallowded ==0) {
			System.out.println("Not allowded to do more transections");
		}
		
	}

	@Override
	public void withdraw(double withdrawmoney) {
		// TODO Auto-generated method stub
		if (withdrawllimit > withdrawmoney) {
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
				System.out.println("***********Thank you for Choosing Scotia Bank***********");
			}

		} else {
			System.out.println("You have excceded withdrawal limit of 900. Insufficiant Funds!");
		}

	}

	@Override
	public void fundTransfer(double fundtransfer) {
		// TODO Auto-generated method stub
		
		if(accountBalance>fundtransfer) {
			accountBalance = accountBalance - fundtransfer;
			System.out.println("~~~~~~~~~~~Your Fund Transfer for " +fundtransfer+" Dollars into Saving Account is successfull~~~~~~~~~~~" +"\n"+" New balance after fund transfer is : " + accountBalance);
			
		}else {
			System.out.println("Invalid Amount!!");
		}

	}

	@Override
	public void investment(double investment) {
		// TODO Auto-generated method stub
		if(accountBalance>investment) {
			accountBalance = accountBalance - investment;
			System.out.println("~~~~~~~~~~~Your Investment for " +investment+" Dollars into TFSA Account is successfull~~~~~~~~~~~" +"\n"+" New balance after fund transfer is : " + accountBalance);
		}else {
			System.out.println("Invalid Amount!!");
		}
	}

	@Override
	public boolean useridentifcation() {
		System.out.println("Please enter 4 digit PIN for Online Banking: ");
		this.pin = sc.nextInt();
		
		while(totalattempt !=0) {
			if ((this.pin == temporarypin)) {
			
				return true;
			} else {
				System.out.println("~~~~~~~~~~~~~~Wrong PIN Number! No of attempts Left: " +totalattempt+" ~~~~~~~~~~~~~~~~~");
				System.out.println("Please enter 4 digit PIN for Online Banking again: ");
				this.pin = sc.nextInt();
				totalattempt--;
			}}
		if(totalattempt ==0) {
			System.out.println("*******MAXIMUM ATTEMPTS REACHED********");
			
		}
		return false;
		
	}
	
	
	

	@Override
	public void pinChange(int pinchange) {
		// TODO Auto-generated method stub
		temporarypin= pinchange;
		System.out.println("Pin Updated Successfully to: ##" +temporarypin+ "**");
		
	}
}

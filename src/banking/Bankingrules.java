package banking;

public abstract class Bankingrules {
	double accountBalance=1000;
	int pin;
	int withdrawllimit;
	int noOftransectionsallowded = 3;
	public Bankingrules(int pin) {
		super();
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	


	public abstract boolean useridentifcation();
	
	public  void dailywithdrawallimitallowed() {
		
		withdrawllimit = 900;
		
	}
	
	public abstract  void pinChange(int pinchange);

	public abstract void deposit(double depositmoney) ;
		// TODO Auto-generated method stub
		
	

	public abstract void withdraw(double withdrawmoney);
		// TODO Auto-generated method stub

	
	
	
	

}

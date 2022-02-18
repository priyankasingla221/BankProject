package banking;

public class PersonDetails {
	private String accountOwnerName = "Priyanka Singla";
	private String accountOwnerAccountNo = "IVZ819507";
	private double totalFunds=1000;
	private String accountType="Checking";
	
	public String getAccountOwnerName() {
		return accountOwnerName;
	}
	public void setAccountOwnerName(String accountOwnerName) {
		this.accountOwnerName = accountOwnerName;
	}
	public String getAccountOwnerAccountNo() {
		return accountOwnerAccountNo;
	}
	public void setAccountOwnerAccountNo(String accountOwnerAccountNo) {
		this.accountOwnerAccountNo = accountOwnerAccountNo;
	}
	public double getTotalFunds() {
		return totalFunds;
	}
	public void setTotalFunds(double totalFunds) {
		this.totalFunds = totalFunds;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}

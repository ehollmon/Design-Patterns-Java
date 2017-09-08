
public class ATMMachine implements GetBankAccountData {
	
	int accountBalance = 25000;
	String accountStatus = "open";

	@Override
	public String getBankAccountData() {
		// TODO Auto-generated method stub
		return accountStatus;
	}

	@Override
	public int getAccountBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}

	public void setBankAccountData(String newData) {
		// TODO Auto-generated method stub
		accountStatus =  newData;
	}

	public void setAccountBalance(int newBalance) {
		// TODO Auto-generated method stub
		accountBalance =  newBalance;
	}

}

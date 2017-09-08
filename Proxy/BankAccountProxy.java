
public class BankAccountProxy implements GetBankAccountData {

	@Override
	public String getBankAccountData() {
		
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getBankAccountData();
		
	}

	@Override
	public int getAccountBalance() {

		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getAccountBalance();
		
	}

}

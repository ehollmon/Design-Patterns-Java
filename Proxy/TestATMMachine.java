
public class TestATMMachine {

	public static void main(String[] args) {
		
		GetBankAccountData realATMMachine = new ATMMachine();
		
		GetBankAccountData atmProxy = new BankAccountProxy();
		
		System.out.println("\n Current Bank Account Status: " + atmProxy.getBankAccountData());
		
		System.out.println("\n Current Bank Account Balance: " + atmProxy.getAccountBalance());
		
	}

}

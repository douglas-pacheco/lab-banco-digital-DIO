
public class Main {

	public static void main(String[] args) {
		Customer venilton = new Customer();
		venilton.setName("Venilton");
		
		Account checkingAccount = new CheckingAccount(venilton);
		Account savingsAccount = new StandartSavingsAccount(venilton);

		checkingAccount.deposit(100);
		checkingAccount.transfer(100, savingsAccount);
		
		checkingAccount.printStatement();
		savingsAccount.printStatement();
	}

}

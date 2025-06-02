
public abstract class SavingsAccount extends Account {


	public SavingsAccount(Customer customer) {
		super(customer);
	}

	public void printStatement() {
		System.out.println("=== Savings Account Statement ===");
		super.printCommonInfo();
	}
}

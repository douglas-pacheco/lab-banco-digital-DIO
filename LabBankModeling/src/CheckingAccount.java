
public class CheckingAccount extends Account {

	public CheckingAccount(Customer customer) {
		super(customer);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Checking Account Statement===");
		super.printCommonInfo();
	}
	
}

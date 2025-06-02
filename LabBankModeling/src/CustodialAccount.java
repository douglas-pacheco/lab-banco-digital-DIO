public class CustodialAccount extends Account{

    public CustodialAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Custodian Account Statement===");

    }
}


public class SavingsAccount extends Account {

	public SavingsAccount(Customer customer) {
		super(customer);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}

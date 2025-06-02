import lombok.Getter;

public abstract class Account implements IAccount {
	
	private static final int DEFAULT_BRANCH = 1;
	private static int SEQUENTIAL = 1;

	@Getter
    protected int branch;
	@Getter
    protected int accountNumber;
	@Getter
    protected double balance;
	protected Customer customer;

	public Account(Customer customer) {
		this.branch = Account.DEFAULT_BRANCH;
		this.accountNumber = SEQUENTIAL++;
		this.customer = customer;
	}

	@Override
	public void withdraw(double valor) {
		balance -= valor;
	}

	@Override
	public void deposit(double valor) {
		balance += valor;
	}

	@Override
	public void transfer(double valor, IAccount contaDestino) {
		this.withdraw(valor);
		contaDestino.deposit(valor);
	}

    protected void printCommonInfo() {
		System.out.printf("Customer: %s%n", this.customer.getName());
		System.out.printf("Branch: %d%n", this.branch);
		System.out.printf("Account Number: %d%n", this.accountNumber);
		System.out.printf("Balance: %.2f%n", this.balance);
	}
}

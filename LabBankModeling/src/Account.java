import lombok.Getter;

public abstract class Account implements IAccount {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	@Getter
    protected int agencia;
	@Getter
    protected int numero;
	@Getter
    protected double saldo;
	protected Customer customer;

	public Account(Customer customer) {
		this.agencia = Account.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.customer = customer;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IAccount contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    protected void imprimirInfosComuns() {
		System.out.printf("Titular: %s%n", this.customer.getNome());
		System.out.printf("Agencia: %d%n", this.agencia);
		System.out.printf("Numero: %d%n", this.numero);
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}
}


public class Main {

	public static void main(String[] args) {
		Customer venilton = new Customer();
		venilton.setNome("Venilton");
		
		Account cc = new CheckingAccount(venilton);
		Account poupanca = new SavingsAccount(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

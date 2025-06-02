
public class Main {

	public static void main(String[] args) {
		Customer venilton = new Customer();
		venilton.setNome("Venilton");
		
		Account cc = new CheckingAccount(venilton);
		Account poupanca = new SavingsAccount(venilton);

		cc.deposit(100);
		cc.transfer(100, poupanca);
		
		cc.printStatement();
		poupanca.printStatement();
	}

}


public interface IAccount {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IAccount contaDestino);
	
	void imprimirExtrato();
}

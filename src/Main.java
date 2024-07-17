
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente_01 = new Cliente();
		cliente_01.setNome("Calabreso");
		
		
		Conta contaCorrente = new ContaCorrente(cliente_01);
		Conta contaPoupança = new ContaCorrente(cliente_01);
		
		contaCorrente.depositar(1000);
		contaCorrente.transferir(800, contaPoupança);
		
		contaCorrente.imprimirExtrato();
		contaPoupança.imprimirExtrato();
	}

}

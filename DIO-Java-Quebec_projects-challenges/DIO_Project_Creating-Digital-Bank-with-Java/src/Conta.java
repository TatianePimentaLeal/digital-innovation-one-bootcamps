
public abstract class Conta implements IConta {
	
	/*uma classe abstrata n�o pode ser instanciada a classe Conta n�o pode ser instanciada 
	 * porque n�o faz sentido que instanciem apenas conta e n�o corrente ou poupanca*/
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1; //TEM RELACAO COM A CLASSE E N�O COM A CONTA. GERA VALOR SEQUENCIAL NA PR�PRIA CLASSE
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
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
	public void tranferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	

}

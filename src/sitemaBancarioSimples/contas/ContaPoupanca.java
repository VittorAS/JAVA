package sitemaBancarioSimples.contas;

public class ContaPoupanca extends ContaBancaria{
	private double taxaJuros;
	
	public ContaPoupanca() {
	}
	public ContaPoupanca(String numeroConta, String titular, double saldo, Double taxaJuros) {
		super(numeroConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public void calcularJuros() {
		setSaldo(getSaldo()+ getSaldo()*taxaJuros);
	}
	
	@Override
	void calcularTarifaMensal() {
		setSaldo(getSaldo()-5);
		
	}

}

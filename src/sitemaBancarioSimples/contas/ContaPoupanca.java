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
	public void calcularTarifaMensal() {
		setSaldo(getSaldo()-5);
	}
	@Override
	public String toString() {
		return "ContaPoupanca [taxaJuros=" + taxaJuros + ", getNumeroConta()=" + getNumeroConta() + ", getTitular()="
				+ getTitular() + ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString() + "]";
	}
	
	

}

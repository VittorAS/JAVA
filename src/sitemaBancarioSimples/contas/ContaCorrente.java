package sitemaBancarioSimples.contas;

public class ContaCorrente extends ContaBancaria{
	private Double limiteChequeEspecial;

	public ContaCorrente() {
	}
	public ContaCorrente(String numeroConta, String titular, double saldo, Double limiteChequeEspecial) {
		super(numeroConta, titular, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public boolean sacar(double valor) {
		if (getSaldo() >= valor && valor <= limiteChequeEspecial) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	void calcularTarifaMensal() {
		if ((getSaldo()*0.15) >= 20){
			setSaldo(getSaldo()-getSaldo()*0.15);
		} else {
			setSaldo(getSaldo()-20);
		}
	}
	@Override
	public String toString() {
		return "ContaCorrente [limiteChequeEspecial=" + limiteChequeEspecial + ", getNumeroConta()=" + getNumeroConta()
				+ ", getTitular()=" + getTitular() + ", getSaldo()=" + getSaldo() ;
	}
	

}

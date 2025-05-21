package sitemaBancarioSimples.contas;

public abstract class ContaBancaria {
	private String numeroConta, titular;
	private Double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(String numeroConta, String titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	abstract void calcularTarifaMensal();

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void transferir(ContaBancaria destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
		}
	}
}

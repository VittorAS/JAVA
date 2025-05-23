package sitemaBancarioSimples.contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<ContaBancaria> contas = new ArrayList<>();
	
	public void adicionarContaCorrente(String numeroConta, String titular, double saldo, Double limiteChequeEspecial) {
		for (ContaBancaria contaBancaria : contas) {
			if (contaBancaria.getNumeroConta().equalsIgnoreCase(numeroConta)) {
				 System.out.println("Número de conta já existente.");
		         return;
			}
		}
		contas.add(new ContaCorrente(numeroConta, titular, saldo, limiteChequeEspecial));
	}
	
	public void adicionarContaPoupanca(String numeroConta, String titular, double saldo, Double taxaJuros) {
		for (ContaBancaria contaBancaria : contas) {
			if (contaBancaria.getNumeroConta().equalsIgnoreCase(numeroConta)) {
				 System.out.println("Número de conta já existente.");
		         return;
			}
		}
		contas.add(new ContaPoupanca(numeroConta, titular, saldo, taxaJuros));
	}
	
	public ContaBancaria buscarPorConta(String numeroConta) {
		for (ContaBancaria contaBancaria : contas) {
			if(contaBancaria.getNumeroConta().equalsIgnoreCase(numeroConta)) {
				System.out.println(contaBancaria);
				return contaBancaria;
			}
		}
		return null;
	}
	
	public void listarTodos() {
		for (ContaBancaria contaBancaria : contas) {
			System.out.println(contaBancaria.toString());
		}
	}
	
}

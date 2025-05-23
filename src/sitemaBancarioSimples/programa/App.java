package sitemaBancarioSimples.programa;

import sitemaBancarioSimples.contas.Banco;
import sitemaBancarioSimples.contas.ContaBancaria;
import sitemaBancarioSimples.contas.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		Banco banco = new Banco();

        // Criando contas
        banco.adicionarContaCorrente("001", "João", 1000.0, 500.0);
        banco.adicionarContaCorrente("002", "Maria", 800.0, 300.0);
        banco.adicionarContaPoupanca("003", "Ana", 1200.0, 0.02);
        banco.adicionarContaPoupanca("004", "Pedro", 500.0, 0.015);

        // Buscando contas
        ContaBancaria conta1 = banco.buscarPorConta("001");
        ContaBancaria conta2 = banco.buscarPorConta("002");
        ContaBancaria conta3 = banco.buscarPorConta("003");
        ContaBancaria conta4 = banco.buscarPorConta("004");

        // Depósitos
        conta1.depositar(200);
        conta3.depositar(150);

        // Saques
        conta2.sacar(100);
        conta4.sacar(50);

        // Transferência
        conta1.transferir(conta2, 300);

        // Cálculo de tarifas
        conta1.calcularTarifaMensal();
        conta2.calcularTarifaMensal();
        conta3.calcularTarifaMensal();
        conta4.calcularTarifaMensal();

        // Cálculo de juros (apenas para poupança)
        if (conta3 instanceof ContaPoupanca)
            ((ContaPoupanca) conta3).calcularJuros();
        if (conta4 instanceof ContaPoupanca)
            ((ContaPoupanca) conta4).calcularJuros();

        // Listando contas
        banco.listarTodos();

	}

}

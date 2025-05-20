package gerenciamentoAlunos.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import gerenciamentoAlunos.entidades.AlunoService;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AlunoService servico = new AlunoService();

		boolean continuarOp = true;

		do {
			System.out.println("\nGerenciador de Alunos:");
			System.out.println("1- Adicionar Alunos");
			System.out.println("2- Buscar Alunos");
			System.out.println("3- Listas Alunos");
			System.out.println("4- Remover Alunos");
			System.out.println("5- Listar Aprovados");
			System.out.println("6- Sair");
			int op = sc.nextInt();
			sc.next();

			switch (op) {
			case 1:
				adicionarAluno(sc, servico);
				break;
			case 2:
				buscarAluno(sc, servico);
				break;
			case 3:
				servico.listarAlunos();
				break;
			case 4:
				removerAluno(sc, servico);
				break;
			case 5:
				servico.listarAprovados();
				break;
			case 6:
				continuarOp = confirmarSaida(sc);
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		} while (continuarOp);

		sc.close();
	}

	
	private static void adicionarAluno(Scanner sc, AlunoService servico) {
		List<Double> notas = new ArrayList<>();
		System.out.print("Matrícula: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		System.out.println("Quantas notas serão adicionadas? ");
		int nNotas = sc.nextInt();
		for (int i = 0; i < nNotas; i++) {
			System.out.printf("%dº Nota: %n", (i + 1));
			double nota = sc.nextDouble();
			notas.add(nota);
		}
		sc.nextLine();
		servico.adicionarAluno(id, nome, email, idade, notas);
		System.out.println("Aluno adicionar com sucesso!");
	}

	private static void buscarAluno(Scanner sc, AlunoService servico) {
		System.out.print("Digite o nome do aluno:");
		String pesquisa = sc.nextLine();
		servico.buscarAluno(pesquisa);
	}

	private static void removerAluno(Scanner sc, AlunoService servico) {
		System.out.println("Digite o nome que deseja remover:");
		String remover = sc.nextLine();
		servico.removerAluno(remover);
	}

	private static boolean confirmarSaida(Scanner sc) {
		System.out.println("Deseja, realmente, encerrar a operação? [S|N]");
		sc.nextLine();
		String resposta = sc.nextLine();
		return resposta.equalsIgnoreCase("s");
	}
}

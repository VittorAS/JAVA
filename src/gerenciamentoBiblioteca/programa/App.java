package gerenciamentoBiblioteca.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import gerenciamentoBiblioteca.livros.Livro;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Livro> livros = new ArrayList<Livro>();
		Boolean continuar = true;

		do {
			System.out.println();
			System.out.println("Selecione a Operação: ");
			System.out.println("1- Adicionar Livro");
			System.out.println("2- Listar Livros");
			System.out.println("3- Deletar Livro");
			System.out.println("4- Cancelar Operação");
			System.out.println();
			int operacao = sc.nextInt();
			switch (operacao) {

			case 1:

				sc.nextLine();
				System.out.print("Digite o título do livro: ");
				String titulo = sc.nextLine();
				System.out.print("Digite a edição do livro: ");
				Integer edicao = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor = sc.nextLine();

				try {
					livros.add(new Livro(titulo, edicao, autor));
					System.out.println("Livro adicionado com Sucesso:");
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 2:

				if (!livros.isEmpty()) {
					for (Livro livro : livros) {
						System.out.println(livro);
					}
				} else {
					System.out.println("A lista está vazia!");
				}
				break;

			case 3:
				Iterator<Livro> it = livros.iterator();
				sc.nextLine();
				System.out.println("Digite o titulo do livro para deletar: ");
				String tituloDeletar = sc.nextLine();
				boolean encontrado = false;
				while (it.hasNext()) {
					if (it.next().getTitulo().equalsIgnoreCase(tituloDeletar)) {
						it.remove();
						System.out.println("Livro removido com Sucesso!");
						encontrado = true;
						break;
					}
					if (!encontrado) {
						System.out.println("O Livro não foi encontrado!");
					}
				}
				break;

			case 4:
				System.out.println("Deseja, realmente, cancelar a operação? [S|N]");
				String selecao = sc.next();
				if (selecao.equalsIgnoreCase("S")) {
					continuar = false;
				}
			}

		} while (continuar);

		sc.close();
	}

}

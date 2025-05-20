package gerenciamentoAlunos.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CadastrarAluno {
	List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno() {
		alunos.add(new Aluno());
		System.out.println("Livro adicionado com sucesso!");
	}
	
	public void buscarAluno(String nome) {
		Iterator<Aluno> iterator = alunos.iterator();
		boolean encontrado = false;
		while(iterator.hasNext()) {
			if(iterator.next().getNome().equalsIgnoreCase(nome)) {
				iterator.toString();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Aluno não encontrado!");
		}
	}
	
	public void removerAluno(String nome) {
		Iterator<Aluno> iterator = alunos.iterator();
		boolean encontrado = false;
		while(iterator.hasNext()) {
			if(iterator.next().getNome().equalsIgnoreCase(nome)) {
				iterator.remove();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Aluno não encontrado!");
		}
	}
	
	public void listarAluno() {
		if(alunos.isEmpty() == false) {
			for (Aluno aluno : alunos) {
				System.out.println(aluno);
			}
		} else {
			System.out.println("A lista está vazia!");
		}
	}
}

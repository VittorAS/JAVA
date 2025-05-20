package gerenciamentoAlunos.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlunoService {
	List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(Integer id, String nome, String email, int idade, List<Double> notas) {
		alunos.add(new Aluno());
		System.out.println("Aluno adicionado com sucesso!");
	}
	
	public void buscarAluno(String nome) {
		Iterator<Aluno> iterator = alunos.iterator();
		boolean encontrado = false;
		while(iterator.hasNext()) {
			if(iterator.next().getNome().equalsIgnoreCase(nome)) {
				System.out.println(iterator);
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
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Aluno não encontrado!");
		}
	}
	
	public void listarAluno() {
		if(!alunos.isEmpty()) {
			for (Aluno aluno : alunos) {
				System.out.println(aluno);
			}
		} else {
			System.out.println("A lista está vazia!");
		}
	}
}

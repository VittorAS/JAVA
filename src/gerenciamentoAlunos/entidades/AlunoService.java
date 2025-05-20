package gerenciamentoAlunos.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlunoService {
	private List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(Integer id, String nome, String email, int idade, List<Double> notas) {
		alunos.add(new Aluno(id, nome, email, idade, notas));
		System.out.println("Aluno adicionado com sucesso!");
	}
	
	public void buscarAluno(String nome) {
		boolean encontrado = false;
		for (Aluno a : alunos) {
			if(a.getNome().equalsIgnoreCase(nome)) {
				System.out.println(a.toString());
				encontrado = true;
				break;
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
				System.out.println("Aluno removido com sucesso");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Aluno não encontrado!");
		}
	}
	
	public void listarAlunos() {
		if(!alunos.isEmpty()) {
			for (Aluno aluno : alunos) {
				System.out.println(aluno.toString());
			}
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public void listarAprovados() {	
		for (Aluno aluno : alunos) {
			if(aluno.isAprovado()) {
				System.out.println(aluno.toString());
			}
		}
	}

}

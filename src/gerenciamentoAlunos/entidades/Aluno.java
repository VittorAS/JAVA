package gerenciamentoAlunos.entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private Integer id;
	private String nome, email;
	private int idade;
	private List<Double> notas = new ArrayList<>();
	
	public Aluno() {
	}
	public Aluno(Integer id, String nome, String email, int idade, List<Double> notas) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.notas = notas;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void adicionarNota(double nota) {
		notas.add(nota);
	}
	public double calcularMedia() {
		double soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma += notas.get(i);
		}
		return soma/notas.size();
	}
	public boolean verificarAprovacao() {
		if (calcularMedia() >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Id: " + id + ", Nome: " + nome + ", Email: " + email + ", Idade: " + idade;
	}
}

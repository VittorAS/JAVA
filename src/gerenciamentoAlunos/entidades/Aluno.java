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
		this.notas = new ArrayList<>(notas);
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
		if(notas.isEmpty()) {
			return 0;
		}
		double soma = 0;
		for (Double nota : notas) {
			soma+=nota;
		}
		return soma/notas.size();
	}
	public boolean isAprovado() {
		return calcularMedia() >= 7;
	}
	
	public String toString() {
		return "Id: " + id + ", Nome: " + nome + ", Email: " + email + ", Idade: " + idade + ", Média: " + calcularMedia() + ", Status: " + isAprovado();
	}
}

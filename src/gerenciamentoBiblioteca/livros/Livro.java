package gerenciamentoBiblioteca.livros;

public class Livro {
	private String autor;
	private Integer edicao;
	private String titulo;
	
	public Livro() {
	}
	public Livro(String titulo, Integer edicao, String autor) {
		this.titulo = titulo;
		this.edicao = edicao;
		this.autor = autor;
		
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getEdicao() {
		return edicao;
	}
	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "titulo: " + titulo + ", edicao: " + edicao + ", autor: " + autor + ".";
	}
}

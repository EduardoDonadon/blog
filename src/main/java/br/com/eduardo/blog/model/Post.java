package br.com.eduardo.blog.model;

public class Post {
	private String titulo;
	private String texto;
	private String autor;
	
	public Post() {
		
	}	

	public Post(String titulo, String texto, String autor) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}

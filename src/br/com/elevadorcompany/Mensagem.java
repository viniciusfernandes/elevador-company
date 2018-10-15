package br.com.elevadorcompany;

public class Mensagem {
	private String texto;

	public Mensagem(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Mensagem append(String mensagem) {
		if (this.texto == null) {
			this.texto = mensagem;
		} else if (mensagem == null) {
			return this;
		}
		this.texto += mensagem;
		return this;
	}

}

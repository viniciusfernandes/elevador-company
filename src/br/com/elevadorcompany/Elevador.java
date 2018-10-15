package br.com.elevadorcompany;

public interface Elevador {

	boolean movimentar(int andar);

	int capacidade();

	int carga();

	int lotacao();

	boolean embarcar(ItemEmbarcavel item);

	boolean desembarcar(int indiceItem);

	Mensagem mensagem();

	String descricaoItens();
	
	String descricaoTecnica();
}

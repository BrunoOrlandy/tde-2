package br.com.locadora.classes;

public class Moto extends Automovel {
	public boolean partidaEltrica;
	public String modelo;

	public Moto() {
	}

	public Moto(boolean partidaEltrica, String modelo) {
		super();
		this.partidaEltrica = partidaEltrica;
		this.modelo = modelo;
	}

	public Moto(boolean partidaEltrica, String modelo, String placa, int capacidadePessoas, double valorBaseLocacao,
			int ano) {
		super(placa, capacidadePessoas, valorBaseLocacao, ano);
		this.partidaEltrica = partidaEltrica;
		this.modelo = modelo;
	}

	public boolean isPartidaEltrica() {
		return partidaEltrica;
	}

	public void setPartidaEltrica(boolean partidaEltrica) {
		this.partidaEltrica = partidaEltrica;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	double valorBaseAutovel() {

		return 15.00;
	}

}

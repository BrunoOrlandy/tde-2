package br.com.locadora.classes;

public class Moto extends Automovel {
	private int potencia;
	private String modelo;

	public Moto() {
		super();
	}

	public Moto(int potencia, String modelo) {
		super();
		this.potencia = potencia;
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	double valorBaseAutovel() {
		return getValorBaseLocacao() + 50.00;
	}

	@Override
	public String toString() {
		return "Moto [potencia=" + potencia + ", modelo=" + modelo + ", placa=" + placa + ", capacidadePessoas="
				+ capacidadePessoas + ", valorBaseLocacao=" + valorBaseLocacao + ", ano=" + ano + ", porteVeiculo="
				+ porteVeiculo + "]";
	}

}

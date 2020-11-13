package br.com.locadora.classes;

public abstract class Automovel {
	protected String placa;
	protected int capacidadePessoas;
	protected double valorBaseLocacao;
	protected int ano;

	public Automovel() {
	}

	public Automovel(String placa, int capacidadePessoas, double valorBaseLocacao, int ano) {
		super();
		this.placa = placa;
		this.capacidadePessoas = capacidadePessoas;
		this.valorBaseLocacao = valorBaseLocacao;
		this.ano = ano;
	}

	public String ligar() {
		return "Ligado";
	}

	public String desligar() {
		return "Desligado";
	}

	public int acelerar() {
		return 10;
	}

	// getter setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public double getValorBaseLocacao() {
		return valorBaseLocacao;
	}

	public void setValorBaseLocacao(double valorBaseLocacao) {
		this.valorBaseLocacao = valorBaseLocacao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	abstract double valorBaseAutovel();

	@Override
	public String toString() {
		return "Automovel [placa=" + placa + ", capacidadePessoas=" + capacidadePessoas + ", valorBaseLocacao="
				+ valorBaseLocacao + ", ano=" + ano + "]";
	}

}

package br.com.locadora.classes;

public class Onibus extends Automovel {
	private int numeroDePortas;
	private int numeroDeBanheiros;

	public Onibus() {
		super();
	}

	public Onibus(int numeroDePortas, int numeroDeBanheiros) {
		super();
		this.numeroDePortas = numeroDePortas;
		this.numeroDeBanheiros = numeroDeBanheiros;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDeBanheiros() {
		return numeroDeBanheiros;
	}

	public void setNumeroDeBanheiros(int numeroDeBanheiros) {
		this.numeroDeBanheiros = numeroDeBanheiros;
	}

	double valorBaseAutovel() {
		return getValorBaseLocacao() + 400.00;
	}

	@Override
	public String toString() {
		return "Onibus [numeroDePortas=" + numeroDePortas + ", numeroDeBanheiros=" + numeroDeBanheiros + ", placa="
				+ placa + ", capacidadePessoas=" + capacidadePessoas + ", valorBaseLocacao=" + valorBaseLocacao
				+ ", ano=" + ano + ", porteVeiculo=" + porteVeiculo + "]";
	}

}

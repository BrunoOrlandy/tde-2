package br.com.locadora.classes;

public class Carro extends Automovel {
	private int numeroPortas;
	private boolean contemRadio;
	private boolean tracaoQuatroRodas;
	private boolean direcaoHidraulica;

	public Carro() {
		super();
	}

	public Carro(int numeroPortas, boolean contemRadio, boolean tracaoQuatroRodas, boolean direcaoHidraulica) {
		super();
		this.numeroPortas = numeroPortas;
		this.contemRadio = contemRadio;
		this.tracaoQuatroRodas = tracaoQuatroRodas;
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public String darMarchaRe() {
		return "Marcha R engatada";
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public boolean isContemRadio() {
		return contemRadio;
	}

	public void setContemRadio(boolean contemRadio) {
		this.contemRadio = contemRadio;
	}

	public boolean isTracaoQuatroRodas() {
		return tracaoQuatroRodas;
	}

	public void setTracaoQuatroRodas(boolean tracaoQuatroRodas) {
		this.tracaoQuatroRodas = tracaoQuatroRodas;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	double valorBaseAutovel() {

		return getValorBaseLocacao() + 100.00;
	}

	@Override
	public String toString() {
		return "Carro [numeroPortas=" + numeroPortas + ", contemRadio=" + contemRadio + ", tracaoQuatroRodas="
				+ tracaoQuatroRodas + ", direcaoHidraulica=" + direcaoHidraulica + ", placa=" + placa
				+ ", capacidadePessoas=" + capacidadePessoas + ", valorBaseLocacao=" + valorBaseLocacao + ", ano=" + ano
				+ ", porteVeiculo=" + porteVeiculo + "]";
	}

}

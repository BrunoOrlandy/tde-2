package br.com.locadora.classes;

public class Carro extends Automovel {
	private int numeroPortas;
	private boolean contemRadio;
	private boolean tracaoQuatroRodas;
	private boolean direcaoHidraulica;

	public String darMarchaRé() {
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

	@Override
	double valorBaseAutovel() {
		return 20.00;
	}

}

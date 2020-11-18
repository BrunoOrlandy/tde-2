package br.com.locadora.classes;

import java.util.Date;

/**
 * @author bruno
 *
 */
public class ComprovanteLocacao {
	private Automovel automovel;
	private String dataLocacao;
	private String dataDevolucao;
	private int dias;
	private double valor;
	private double multa;
	private double desconto;

	public ComprovanteLocacao() {

	}

	public ComprovanteLocacao(Automovel automovel, String dataLocacao, String dataDevolucao, int dias, double valor,
			double multa, double desconto) {
		super();
		this.automovel = automovel;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.dias = dias;
		this.valor = valor;
		this.multa = multa;
		this.desconto = desconto;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return "ComprovanteLocacao [automovel=" + automovel + ", dataLocacao=" + dataLocacao + ", dataDevolucao="
				+ dataDevolucao + ", dias=" + dias + ", valor=" + valor + ", multa=" + multa + ", desconto=" + desconto
				+ "]";
	}

}

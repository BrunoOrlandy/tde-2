package br.com.locadora.main;

import java.util.Calendar;

import br.com.locadora.classes.Automovel;
import br.com.locadora.classes.Carro;
import br.com.locadora.classes.Moto;
import br.com.locadora.classes.Onibus;
import br.com.locadora.utils.IniciaLista;

public class ClassificadoDiaria {

	public static Carro carro = new Carro();
	public Moto moto = new Moto();
	public Onibus o = new Onibus();
	Calendar cal = Calendar.getInstance();

	double percentual = 0.2;
	double percentrualFixo = 0.10;
	double acrecimoPorPessoa = 0.5;
	double acrecimoMaximo = 2.0;
	double valorDiaria = 0;
	double valorBase;
	double desconto = 0;
	double acrecimo = 0;
	int ano = cal.get(Calendar.YEAR);
	int diferencaAnos = 0;
	public boolean isPopular;
	public boolean isMedio;

	public ClassificadoDiaria() {
	}

	public double calcular(Automovel automovel, int numeroDias) {

		String porte = popularMedioOuGrandePorte(automovel);
		valorBase = automovel.getValorBaseLocacao();

		if (porte.equals("medio")) {
			diferencaAnos = automovel.getAno() - ano;
			desconto = (percentual * diferencaAnos);
			if (desconto < 10.00) {
				return valorDiaria = valorBase - (0.10 * valorBase);
			}
			return valorBase * numeroDias;
		}

		if (porte.equals("grande")) {
			int capacidadePessoa = automovel.getCapacidadePessoas();
			acrecimoPorPessoa = (capacidadePessoa * 0.5);
			if (acrecimoPorPessoa < 20.00) {
				valorDiaria = valorBase + (acrecimoMaximo + valorBase);
				return valorDiaria * numeroDias;
			} else {
				valorDiaria = valorBase + (acrecimoPorPessoa + valorBase);
				return valorDiaria * numeroDias;
			}

		} else {
			valorDiaria = automovel.getValorBaseLocacao();
			return valorDiaria * numeroDias;
		}

	}

	public String popularMedioOuGrandePorte(Automovel automovel) {

		if (automovel.getCapacidadePessoas() > 5) {
			return "grande";
		}
		ano = automovel.getAno() - ano;
		if (ano < 10) {
			return "medio";
		}

		return "popular";

	}

	public static void main(String[] args) {
//		ClassificadoDiaria c = new ClassificadoDiaria();
//		Carro ca = new Carro();
//		Onibus o = new Onibus();

		IniciaLista i = new IniciaLista();
//		i.listaAutomoveis();

//		o = i.objetoOnibus();
//
//		// Automovel a = ca;
//
//		System.out.println(c.calcular(o));

	}

}

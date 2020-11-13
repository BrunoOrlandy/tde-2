package br.com.locadora.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.locadora.classes.Automovel;
import br.com.locadora.classes.Carro;
import br.com.locadora.classes.Moto;
import br.com.locadora.classes.Onibus;

public class IniciaLista {
	public ArrayList<Automovel> automoveis;
	public ArrayList<Carro> carros;

	public ArrayList<Onibus> onibus;

	/*
	 * Metodo que gera um automovel do tipo moto
	 * 
	 * @return List<Moto>
	 */
	public static List<Moto> listarMotos() {
		Moto moto = new Moto();

		moto.setPlaca("ABC-1234");
		moto.setAno(2012);
		moto.setCapacidadePessoas(2);
		moto.setValorBaseLocacao(10.00);
		moto.setPartidaEltrica(false);
		moto.setModelo("Corrida");

		List<Moto> motos = new ArrayList<Moto>();
		motos.add(moto);

//		List<Automovel> automoveis = new ArrayList<Automovel>();
//
//		automoveis.add(moto);

		return motos;
	}

	/*
	 * Metodo que gera um automovel do tipo Carro
	 * 
	 * @return List<Carro>
	 */
	public static List<Carro> listarCarro() {
		Carro carro = new Carro();

		carro.setPlaca("ABC-1234");
		carro.setCapacidadePessoas(2);
		carro.setAno(2012);
		carro.setValorBaseLocacao(10.00);
		carro.setNumeroPortas(5);
		carro.setContemRadio(false);
		carro.setTracaoQuatroRodas(false);
		carro.setDirecaoHidraulica(false);

		List<Carro> carros = new ArrayList<Carro>();
		carros.add(carro);

//		List<Automovel> automoveis = new ArrayList<Automovel>();
//
//		automoveis.add(carro);

		return carros;
	}

	/*
	 * Metodo que gera um automovel do tipo Onibus
	 * 
	 * @return List<Onibus>
	 */
	public static List<Onibus> listarOnibus() {
		Onibus o = new Onibus();

		o.setPlaca("ABC-1234");
		o.setCapacidadePessoas(2);
		o.setAno(2012);
		o.setValorBaseLocacao(10.00);
		o.setNumeroDePortas(2);
		o.setNumeroDeBanheiros(1);
		o.setNumeroDePassageiros(58);

		List<Onibus> onibus = new ArrayList<Onibus>();
		onibus.add(o);

		return onibus;
	}

	/*
	 * Metodo que gera uma lista de Automoveis
	 * 
	 * @return List<Automovel> + automoveis cadastrados na interface
	 */
	public static List<Automovel> listarTodosAutomoveis(Object automovel) {
		List<Automovel> automoveisTodos = new ArrayList<Automovel>();
		automoveisTodos.addAll((Collection<? extends Automovel>) automovel);
		listaAutomoveisPadrao();

		return automoveisTodos;
	}

	/*
	 * Metodo que gera uma lista de Automoveis
	 * 
	 * @return List<Automovel>
	 */
	public static List<Automovel> listaAutomoveisPadrao() {

		List<Automovel> automoveis = new ArrayList<Automovel>();

		automoveis.addAll(listarCarro());
		automoveis.addAll(listarMotos());
		automoveis.addAll(listarOnibus());

		return automoveis;
	}
}

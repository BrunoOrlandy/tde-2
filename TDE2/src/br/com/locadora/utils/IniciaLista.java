package br.com.locadora.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.locadora.classes.Automovel;
import br.com.locadora.classes.Carro;
import br.com.locadora.classes.Moto;
import br.com.locadora.classes.Onibus;

/*
 * Classe usada para moc de dados e carregamento de listas e entidades
 * */
public class IniciaLista {
	public ArrayList<Automovel> automoveis;
	public static ArrayList<Carro> carros = new ArrayList<Carro>();
	public static ArrayList<Onibus> onibus = new ArrayList<Onibus>();
	public static ArrayList<Moto> motos = new ArrayList<Moto>();

	/*
	 * Metodo que gera um automovel do tipo moto
	 * 
	 * @return List<Moto>
	 */
	public static void listarMotos(Moto motoCadastada) {

		motos.add(motoCadastada);

		System.out.println(" - Motos - ");

		for (Moto moto : motos) {
			System.out.println("Placa:" + moto.getPlaca());
			System.out.println("Ano :" + moto.getAno());
			System.out.println("Capacidade de Pessoas:" + moto.getCapacidadePessoas());
			System.out.println("Modelo :" + moto.getModelo());
			System.out.println("Potencia :" + moto.getPotencia());
			System.out.println("Valor base diario: " + moto.getValorBaseLocacao());
			System.out.println();

		}
	}

	public static Moto objetoMoto() {
		Moto moto = new Moto();

		moto.setPlaca("MOT-456");
		moto.setAno(2012);
		moto.setCapacidadePessoas(2);
		moto.setValorBaseLocacao(100.00);
		moto.setPotencia(150);
		moto.setModelo("Corrida");

		return moto;
	}

	/*
	 * Metodo que gera um automovel do tipo Carro
	 * 
	 * @return List<Carro>
	 */
	public static void listarCarro(Carro carrCadastado) {

		carros.add(carrCadastado);

		System.out.println(" - Carros - ");
		for (Carro carro : carros) {
			System.out.println("Ano :" + carro.getAno());
			System.out.println("Capacidade de Pessoas: " + carro.getCapacidadePessoas());
			System.out.println("Numero de Portas :" + carro.getNumeroPortas());
			System.out.println("Valor base diario: " + carro.getValorBaseLocacao());
			System.out.println("Placa :" + carro.getPlaca());
			System.out.println();

		}

	}

	public static Carro objetoCarro() {
		Carro carro = new Carro();

		carro.setPlaca("CAR-789");
		carro.setCapacidadePessoas(2);
		carro.setAno(2012);
		carro.setValorBaseLocacao(200.00);
		carro.setNumeroPortas(5);
		carro.setContemRadio(false);
		carro.setTracaoQuatroRodas(false);
		carro.setDirecaoHidraulica(false);

		return carro;
	}

	/*
	 * Metodo que gera um automovel do tipo Onibus
	 * 
	 * @return List<Onibus>
	 */
	public static void listarOnibus(Onibus onibusCadastrado) {

		onibus.add(onibusCadastrado);

		System.out.println(" - Onibus - ");

		for (Onibus o : onibus) {
			System.out.println("Ano :" + o.getAno());
			System.out.println("Capacidade de Pessoas :" + o.getCapacidadePessoas());
			System.out.println("Numero de banheiros :" + o.getNumeroDeBanheiros());
			System.out.println("Numero de portas:" + o.getNumeroDePortas());
			System.out.println("Valor base diario: " + o.getValorBaseLocacao());
			System.out.println("Placa:" + o.getPlaca());
			System.out.println();

		}

	}

	public static List<Onibus> ooooos() {

		onibus.add(objetoOnibus());
		return onibus;

	}

	public static List<Moto> mmmms() {

		motos.add(objetoMoto());
		return motos;

	}

	public static List<Carro> ccccs() {

		carros.add(objetoCarro());
		return carros;

	}

	public static Onibus objetoOnibus() {
		Onibus o = new Onibus();

		o.setPlaca("BUS-0000");
		o.setCapacidadePessoas(2);
		o.setAno(2012);
		o.setValorBaseLocacao(500.00);
		o.setNumeroDePortas(2);
		o.setNumeroDeBanheiros(1);
		o.setCapacidadePessoas(52);

		return o;
	}

	/*
	 * Metodo que gera uma lista de Automoveis
	 * 
	 * @return List<Automovel>
	 */
	public static List<Automovel> carregarAutomoveis() {

		List<Automovel> automoveis = new ArrayList<Automovel>();

//		automoveis.addAll(carros);
//		automoveis.addAll(motos);
//		automoveis.addAll(onibus);

		automoveis.addAll(ccccs());
		automoveis.addAll(mmmms());
		automoveis.addAll(ooooos());

		return automoveis;
	}

	public List<Automovel> listarAutomoveisCadastrados() {

		List<Automovel> automoveis = new ArrayList<Automovel>();

		automoveis = carregarAutomoveis();

		for (Automovel automovel : automoveis) {

			if (!carros.isEmpty()) {
				for (Automovel carro : carros) {
					System.out.println("Ano :" + carro.getAno());
					System.out.println("Capacidade de Pessoas: " + carro.getCapacidadePessoas());
					System.out.println("Valor base diario: " + carro.getValorBaseLocacao());
					System.out.println("Placa :" + carro.getPlaca());
					System.out.println();
				}
			}

			if (!motos.isEmpty()) {
				for (Automovel moto : motos) {

					System.out.println("Ano :" + moto.getAno());
					System.out.println("Capacidade de Pessoas:" + moto.getCapacidadePessoas());
					System.out.println("Valor base diario: " + moto.getValorBaseLocacao());
					System.out.println("Placa:" + moto.getPlaca());
					System.out.println();

				}
			} else

			if (!onibus.isEmpty()) {
				for (Automovel o : onibus) {
					System.out.println("Ano :" + o.getAno());
					System.out.println("Capacidade de Pessoas :" + o.getCapacidadePessoas());
					System.out.println("Valor base diario: " + o.getValorBaseLocacao());
					System.out.println("Placa:" + o.getPlaca());
					System.out.println();
				}
			} else
				return automoveis;
		}
		return automoveis;
	}

	/*
	 * Metodo que pesquisa na lista os automoveis pelo valor base deles;
	 * 
	 * @return List<Moto>
	 */
	public List<Automovel> pesquisaPorValor(double valor) {

		List<Automovel> automoveis = new ArrayList<Automovel>();
		List<Automovel> automoveisPorValor = new ArrayList<Automovel>();

		automoveis = carregarAutomoveis();

		for (Automovel automovel : automoveis) {

			if (!carros.isEmpty()) {
				for (Automovel carro : carros) {
					if (carro.getValorBaseLocacao() >= valor)
						automoveisPorValor.add(carro);
				}
			}

			if (!motos.isEmpty()) {
				for (Automovel moto : motos) {
					if (moto.getValorBaseLocacao() >= valor) {
						automoveisPorValor.add(moto);
					}
				}
			} else

			if (!onibus.isEmpty()) {
				for (Automovel o : onibus) {
					if (o.getValorBaseLocacao() >= valor) {
						automoveisPorValor.add(o);
					}
				}
			} else
				break;
		}

		return automoveisPorValor;
	}

	/*
	 * getter e setters
	 */

	public ArrayList<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(ArrayList<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public ArrayList<Onibus> getOnibus() {
		return onibus;
	}

	public void setOnibus(ArrayList<Onibus> onibus) {
		this.onibus = onibus;
	}

	public ArrayList<Moto> getMotos() {
		return motos;
	}

	public void setMotos(ArrayList<Moto> motos) {
		this.motos = motos;
	}

}

package br.com.locadora.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.locadora.classes.Carro;
import br.com.locadora.classes.Moto;
import br.com.locadora.classes.Onibus;
import br.com.locadora.utils.IniciaLista;

public class Main {
	public static Scanner entrada; 

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int op;
		do {
			menuDeOpcoes();
			op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("1-Cadastrar Automovel");
				cadastrarAutomovel();
				break;
			case 2:
				System.out.println("2-Pesquisar Automovel");
				break;
			case 3:
				System.out.println("3-Devolver Automovel");
				break;
			case 4:
				System.out.println("4- listar Automoveis");
				IniciaLista.listaAutomoveisPadrao();
				break;
			case 5:
				break;
			case 0:
				System.out.println(" - FIM - ");
				break;
			default:
				System.out.println("opcao invalida");
				break;
			}
		} while (op != 0);

	}

	private static void cadastrarAutomovel() {
		System.out.print("Informe um tipo de veiculo para cadastar");
		mostraOpcoesDeVeiculos();
		int e = entrada.nextInt();
		if (e > 3) {
			System.out.println("Invalido, informe um numero valido");
		}
		cadastrorAutomovelSelecionado(e);
	}

	private static void cadastrorAutomovelSelecionado(int e) {
		if (e == 1) {
			cadastarCarro();
		} else if (e == 2) {
			cadastarMoto();
		}
		cadastarOnibus();
	}

	private static void cadastarOnibus() {
		List<Onibus> onibus = new ArrayList<Onibus>();
		Scanner entrada = new Scanner(System.in);
		Onibus o = new Onibus();

		System.out.print("Numero Placa: ");
		o.setPlaca(entrada.nextLine());
		System.out.print("Numero de pessoas: ");
		o.setCapacidadePessoas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Ano de fabricação: ");
		o.setAno(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de Portas: ");
		o.setNumeroDePortas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de banheiros: ");
		o.setNumeroDeBanheiros(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de passageiros: ");
		o.setNumeroDePassageiros(Integer.parseInt(entrada.nextLine()));

		onibus.add(o);
		IniciaLista.listarTodosAutomoveis(onibus);
		System.out.println(" - Moto cadastrada com sucesso! -");
	}

	private static void cadastarMoto() {
		List<Moto> motos = new ArrayList<Moto>();
		Scanner entrada = new Scanner(System.in);
		Moto moto = new Moto();

		System.out.print("Numero Placa: ");
		moto.setPlaca(entrada.nextLine());
		System.out.print("Ano de fabricação: ");
		moto.setAno(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de pessoas: ");
		moto.setCapacidadePessoas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Contem Tração 4 rodas:  0 - Não | 1 - Sim  ");
		moto.setPartidaEltrica(setaBoolean(Integer.parseInt(entrada.nextLine())));
		System.out.print("Informe o modelo: ");
		moto.setModelo(entrada.nextLine());

		motos.add(moto);
		IniciaLista.listarTodosAutomoveis(moto);
		System.out.println(" - Moto cadastrada com sucesso! -");
	}

	private static void cadastarCarro() {
		List<Carro> carros = new ArrayList<Carro>();
		Scanner entrada = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.print("Numero Placa: ");
		carro.setPlaca(entrada.nextLine());
		System.out.print("Numero de pessoas: ");
		carro.setCapacidadePessoas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Ano de fabricação: ");
		carro.setAno(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de Portas: ");
		carro.setNumeroPortas(Integer.parseInt(entrada.nextLine()));

		System.out.print("Contem Rádio:  0 - Não | 1 - Sim  ");
		carro.setContemRadio(setaBoolean(Integer.parseInt(entrada.nextLine())));
		System.out.print("Contem Tração 4 rodas:  0 - Não | 1 - Sim  ");
		carro.setTracaoQuatroRodas(setaBoolean(Integer.parseInt(entrada.nextLine())));
		System.out.print("Contem direção Hidraulica:  0 - Não | 1 - Sim  ");
		carro.setDirecaoHidraulica(setaBoolean(Integer.parseInt(entrada.nextLine())));

		carros.add(carro);
		IniciaLista.listarTodosAutomoveis(carro);
		System.out.println(" - Carro cadastrado com sucesso! -");
	}

	/*
	 * setaBoolean Metedo para validar cadastro que contem atributos boolean
	 * rececebe um valor inteiro e devolve um boolean
	 * 
	 * @param boolean
	 * 
	 * @return boolean
	 */
	private static boolean setaBoolean(int UmOuZero) {
		while (UmOuZero > 1) {
			if (UmOuZero == 1) {
				return true;
			} else if (UmOuZero == 0) {
				return false;
			}
			System.out.println("     => Opcao invalida 0 - Não | 1 - Sim");
			UmOuZero = entrada.nextInt();
		}
		return false;
	}

	private static void mostraOpcoesDeVeiculos() {
		System.out.println();
		System.out.println(" 1-Carro  |");
		System.out.println(" 2-Moto   |");
		System.out.println(" 3-Onibus |");
		System.out.println();
	}

	public static void menuDeOpcoes() {
		System.out.println("_________________________");
		System.out.println("1-Cadastrar Automovel    |");
		System.out.println("2-Pesquisar Automovel    |");
		System.out.println("3-Devolver Automovel     |");
		System.out.println("0- Sair                  |");
		System.out.println("_________________________|");
	}

}

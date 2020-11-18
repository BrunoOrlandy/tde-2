package br.com.locadora.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.spi.copyobject.CopierManager;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import br.com.locadora.classes.Automovel;
import br.com.locadora.classes.Carro;
import br.com.locadora.classes.ComprovanteLocacao;
import br.com.locadora.classes.Moto;
import br.com.locadora.classes.Onibus;
import br.com.locadora.utils.IniciaLista;

public class Main {
	public static Scanner entrada;
	ComprovanteLocacao cl = new ComprovanteLocacao();

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		IniciaLista i = new IniciaLista();
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
				pesquisarAutomovel();
				break;
			case 3:
				System.out.println("3-Devolver Automovel");
				break;
			case 4:
				System.out.println("4- listar Automoveis");
				i.listarAutomoveisCadastrados();
				break;
			case 5:
				System.out.println("5- Devolver Automovel");
				realizarDevolucao();
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

	private static void realizarDevolucao() {
		System.out.println("Informe a data da devolução do automvel");
		entrada.nextLine();

	}

	private static void pesquisarAutomovel() {

		IniciaLista i = new IniciaLista();
		List<Automovel> automoveiDisponiveis = new ArrayList<Automovel>();
		ComprovanteLocacao comprovante = new ComprovanteLocacao();
		ClassificadoDiaria classificador = new ClassificadoDiaria();

		boolean placaEncontrada = false;

		System.out.println("Informe um valor que pretende pagar: ");
		double valor = entrada.nextDouble();

		automoveiDisponiveis = i.pesquisaPorValor(valor);

		if (automoveiDisponiveis.isEmpty()) {
			System.out.println("Não exitem automoveis com o valor de :R$ " + valor + " ou menor");
		} else {

			for (Automovel automovel : automoveiDisponiveis) {
				System.out.println("________________________");
				System.out.println();
				System.out.println("Placa :" + automovel.getPlaca());
				System.out.println("Ano : " + automovel.getAno());
				System.out.println("Capacidade Pessoas :" + automovel.getCapacidadePessoas());
				System.out.println("Valor base locação : " + automovel.getValorBaseLocacao());
				System.out.println();

			}

			do {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Escolha um automovel digitando a placa :");
				String escolhido = entrada.nextLine().toUpperCase();

				for (Automovel automovel : automoveiDisponiveis) {
					if (automovel.getPlaca().equals(escolhido.toUpperCase())) {
						comprovante.setAutomovel(automovel);
						break;
					}
				}

				if (comprovante.getAutomovel() == null) {
					placaEncontrada = false;
					System.out.println("Placa informada não existe");
					System.out.print("Digite uma placa valida");
					escolhido = entrada.nextLine();
				}

				placaEncontrada = true;
			} while (comprovante.getAutomovel() == null);

			System.out.println("Automovel selecionado : " + comprovante.getAutomovel().getPlaca());

			System.out.println("Informe o numero de dias de locação: ");
			comprovante.setDias(entrada.nextInt());

			System.out.println("A data de retirada: (DDMMMYYY) ");
			comprovante.setDataLocacao(entrada.nextLine());

			System.out.println("");
			comprovante.setValor(classificador.calcular(comprovante.getAutomovel(), comprovante.getDias()));

			System.out.println("Valor total da locação é de R$: " + comprovante.getValor() + " para o total de "
					+ comprovante.getDias() + " dias ");

			comprovante.toString();

			System.out.println(" - Reserva efetuada com sucesso -  ");

		}

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
			return;
		} else if (e == 2) {
			cadastarMoto();
			return;
		}
		cadastarOnibus();
		return;
	}

	private static void cadastarOnibus() {
		List<Onibus> onibus = new ArrayList<Onibus>();
		Scanner entrada = new Scanner(System.in);
		Onibus o = new Onibus();

		System.out.print("Numero Placa: ");
		o.setPlaca(entrada.nextLine().toUpperCase());
		System.out.print("Numero de pessoas: ");
		o.setCapacidadePessoas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Ano de fabricação: ");
		o.setAno(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de Portas: ");
		o.setNumeroDePortas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de banheiros: ");
		o.setNumeroDeBanheiros(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de passageiros: ");
		o.setCapacidadePessoas(Integer.parseInt(entrada.nextLine()));

		IniciaLista.listarOnibus(o);

		System.out.println(" - Onibus cadastrado com sucesso! -");
	}

	private static void cadastarMoto() {
		List<Moto> motos = new ArrayList<Moto>();
		Scanner entrada = new Scanner(System.in);
		Moto moto = new Moto();

		System.out.print("Numero Placa: ");
		moto.setPlaca(entrada.nextLine().toUpperCase());
		System.out.print("Ano de fabricação: ");
		moto.setAno(Integer.parseInt(entrada.nextLine()));
		System.out.print("Numero de pessoas: ");
		moto.setCapacidadePessoas(Integer.parseInt(entrada.nextLine()));
		System.out.print("Potencia: ");
		moto.setPotencia((Integer.parseInt(entrada.nextLine())));
		System.out.print("Informe o modelo: ");
		moto.setModelo(entrada.nextLine());
		moto.setValorBaseLocacao(moto.getValorBaseLocacao());
		System.out.println();

		IniciaLista.listarMotos(moto);

		System.out.println(" - Moto cadastrada com sucesso! -");
	}

	private static void cadastarCarro() {
		List<Carro> carros = new ArrayList<Carro>();
		Scanner entrada = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.print("Numero Placa: ");
		carro.setPlaca(entrada.nextLine().toUpperCase());
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

		IniciaLista.listarCarro(carro);

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

	/*
	 * Metodo que mostra o menu para cadastro de veiculos para usuario
	 */
	private static void mostraOpcoesDeVeiculos() {
		System.out.println();
		System.out.println(" 1-Carro  |");
		System.out.println(" 2-Moto   |");
		System.out.println(" 3-Onibus |");
		System.out.println();
	}

	/*
	 * Metodo que mostra o menu para o usuario
	 */
	public static void menuDeOpcoes() {
		System.out.println("_________________________");
		System.out.println("1-Cadastrar Automovel    |");
		System.out.println("2-Pesquisar Automovel    |");
		System.out.println("3-Devolver Automovel     |");
		System.out.println("4-Listar Automoveis      |");
		System.out.println("5-Devolver Automovel     |");
		System.out.println("0- Sair                  |");
		System.out.println("_________________________|");
	}

}

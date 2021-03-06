package br.com.fiap.teste;

import java.util.List;
import java.util.Scanner;

import br.com.fiap.repository.CompraRepository;
import br.com.fiap.to.CompraTO;

public class CompraTeste {
	
	private static Scanner scanner = new Scanner(System.in);
	private static CompraRepository repository = new CompraRepository();

	public static void main(String[] args) {
		int resp = 0;
		do{
			getMenu();
			resp = scanner.nextInt();
			while(resp < 0 || resp > 5)
				getMenu();
			switch (resp) {
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				alterar();
				break;
			case 4:
				exluir();
				break;
			case 5:
				buscar();
				break;
			default:
				break;
			}
		}while(resp != 0);
	}
	
	public static void getMenu(){
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Buscar");
		System.out.println("0 - Sair");
	}
	
	public static void cadastrar(){
		try {
			CompraTO to = new CompraTO();
			System.out.println("Descri��o: ");
			to.setDescricao(scanner.next());
			System.out.println("Valor: ");
			to.setValor(scanner.nextDouble());
			
			repository.cadastrar(to);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void listar(){
		try{
			List<CompraTO> lista = repository.listar();
			for (CompraTO compraTO : lista) {
				System.out.println(compraTO.getCodigo() + " - " + compraTO.getDescricao() + " - " + compraTO.getValor());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void exluir(){
		try{
			System.out.println("C�digo para remover");
			repository.remover(scanner.nextInt());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void buscar() {
		try{
			System.out.println("C�digo");
			CompraTO compraTO = repository.buscar(scanner.nextInt());
			if(compraTO == null)
				throw new Exception("C�digo inv�lido");
			System.out.println(compraTO.getCodigo() + " - " + compraTO.getDescricao() + " - " + compraTO.getValor());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void alterar(){
		try {
			CompraTO to = new CompraTO();
			System.out.println("C�digo: ");
			to.setCodigo(scanner.nextInt());
			System.out.println("Descri��o: ");
			to.setDescricao(scanner.next());
			System.out.println("Valor: ");
			to.setValor(scanner.nextDouble());
			
			repository.alterar(to);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

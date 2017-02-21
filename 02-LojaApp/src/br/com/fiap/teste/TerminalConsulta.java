package br.com.fiap.teste;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.beans.ProdutoTO;
import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.config.PropertySingleton;

public class TerminalConsulta {

	private static Scanner scanner = new Scanner(System.in);
	private static Logger log = LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void init(){
		log.warn("Inicio da aplica��o");
		String entreprise = PropertySingleton.getInstance().getProperty("entreprise");
		String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		System.out.println(entreprise+"             "+data);
		System.out.println("**************************");
	}
	
	public static void main(String[] args) {
		init();
		int option = 0;
		while(true){
			option = exibirMenu();
			if(option == 1){
				log.debug("Adicionando produto");
				EstoqueBO.add(preencher());
			}else if(option == 2){
				log.debug("Pesquisando produto");
				System.out.println("Digite o c�digo do produto a ser pesquisado");
				ProdutoTO to = EstoqueBO.consultarProduto(scanner.nextInt());
				if(to != null){
					System.out.println(to.getCodigo()+" - "+to.getTitulo()+ " - "+new DecimalFormat("R$ #,###.00").format(to.getPrecoUnitario()));
				}else{
					log.error("Produto n�o encontrado");
					System.out.println("Produto n�o encontrado");
				}
				
			}else if (option == 0) {
				log.warn("FIM da aplica��o");
				break;
			}
		}
	}
	
	public static int exibirMenu(){
		System.out.println("Selecione uma op��o");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Pesquisar produtos");
		System.out.println("0  - Sair");
		return scanner.nextInt();
	}
	
	public static ProdutoTO preencher(){
		ProdutoTO p = new ProdutoTO();
		System.out.print("C�digo : ");
		p.setCodigo(scanner.nextInt());
		System.out.print("T�tulo : ");
		p.setTitulo(scanner.next() + scanner.nextLine());
		System.out.print("Pre�o Unit�rio : ");
		p.setPrecoUnitario(scanner.nextDouble());
		System.out.print("Qtde Estoque : ");
		p.setQtdeEstoque(scanner.nextInt());

		return p;
	}
	
	
	
	

}

package br.com.fiap.start;

import java.util.Scanner;

import br.com.fiap.beans.Tablet;

public class Main2 {

	private static Scanner scanner = new Scanner(System.in);
	private static Tablet[] tablets = new Tablet[0];
	
	public static void main(String[] args) {
		int option = 0;
		while(true){
			option = exibirMenu();
			if(option == 1){
				add(preencher());
			}else if(option == 2){
				for (Tablet t : tablets) {
					System.out.println(t);
				}
			}else if (option == 0) {
				break;
			}
		}
	}
	
	public static int exibirMenu(){
		System.out.println("Selecione uma opção");
		System.out.println("1 - Cadastrar Tablet");
		System.out.println("2 - Exibir Tablets Cadastrados");
		System.out.println("0  - Sair");
		return scanner.nextInt();
	}
	
	public static Tablet preencher(){
		Tablet tablet = new Tablet();
		System.out.println("===== Tablet =====");
		System.out.print("Código : ");
		tablet.setCodigo(scanner.nextInt());
		System.out.print("Título : ");
		tablet.setTitulo(scanner.next());
		System.out.print("Preço : ");
		tablet.setPreco(scanner.nextDouble());
		System.out.print("Modelo : ");
		tablet.setModelo(scanner.next());
		System.out.print("Marca : ");
		tablet.setMarca(scanner.next());
		System.out.print("SO : ");
		tablet.setSistemaOperacional(scanner.next());
		System.out.print("Possui 3g? : ");
		tablet.setIs3g((scanner.next().equalsIgnoreCase("S"))? true : false);
		return tablet;
	}
	
	public static void add(Tablet tablet){
		Tablet[] aux = new Tablet[tablets.length + 1];
		for (int i = 0; i < tablets.length; i++) {
			aux[i] = tablets[i];
		}
		aux[aux.length - 1] = tablet;
		tablets = aux;
	}
	
	

}

package com.biap.loja;

import java.util.Scanner;

public class TerminalConsulta {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("FIAP");
		System.out.println("=============================");
		System.out.println("Código do produto:");
		int cod = scanner.nextInt();
		if(cod == 401){
			System.out.println("Camiseta Masculina Manga Curta Básica");
		}else if(cod == 402){
			System.out.println("Camiseta Feminina Manga Longa Rosa");
		}else{
			System.out.println("Produto Não encontrado");
		}
	}

}

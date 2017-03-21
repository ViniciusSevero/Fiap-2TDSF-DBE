package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.repository.VeiculoRepository;
import br.com.fiap.to.VeiculoTO;

public class TesteBuscar {

	public static void main(String[] args) {
		VeiculoRepository rep = new VeiculoRepository();
		
		try{
			VeiculoTO to = rep.buscar(5);
			
			System.out.println(to.getMarca());
			System.out.println(to.getModelo());
			System.out.println(to.getPreco());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

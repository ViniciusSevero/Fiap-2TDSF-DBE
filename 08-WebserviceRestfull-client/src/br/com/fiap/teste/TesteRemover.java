package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.repository.VeiculoRepository;
import br.com.fiap.to.VeiculoTO;

public class TesteRemover {

	public static void main(String[] args) {
		VeiculoRepository rep = new VeiculoRepository();
		
		try{
			rep.remover(4);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

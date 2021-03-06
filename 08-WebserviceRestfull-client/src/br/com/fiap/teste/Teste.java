package br.com.fiap.teste;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.repository.VeiculoRepository;
import br.com.fiap.to.VeiculoTO;

public class Teste {

	public static void main(String[] args) {
		VeiculoRepository rep = new VeiculoRepository();
		
		try{
			List<VeiculoTO> lista = rep.listar();
			for (VeiculoTO veiculoTO : lista) {
				System.out.println(veiculoTO.getMarca());
				System.out.println(veiculoTO.getModelo());
				System.out.println(veiculoTO.getPreco());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

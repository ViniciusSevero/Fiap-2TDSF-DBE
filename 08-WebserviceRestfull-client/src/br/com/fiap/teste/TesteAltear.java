package br.com.fiap.teste;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.repository.VeiculoRepository;
import br.com.fiap.to.VeiculoTO;

public class TesteAltear {

	public static void main(String[] args) {
		VeiculoRepository rep = new VeiculoRepository();
		
		try {
			rep.alterar(new VeiculoTO(0,"sdfasdfasdfas","Chevolet",100000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

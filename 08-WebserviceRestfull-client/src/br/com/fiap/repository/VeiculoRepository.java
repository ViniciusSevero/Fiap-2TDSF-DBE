package br.com.fiap.repository;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.VeiculoTO;

public class VeiculoRepository {
	public List<VeiculoTO> listar() throws Exception{
		Client client = Client.create();
		WebResource resouce = client.resource("http://localhost:8080/06-WebserviceRestfull-server/rest/veiculo");
		
		ClientResponse response = resouce.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200){
			VeiculoTO[] array = response.getEntity(VeiculoTO[].class);
			return Arrays.asList(array);
		}
		throw new Exception("Erro " + response.getStatus());
	}
	
	public VeiculoTO buscar(int codigo) throws Exception{
		Client client = Client.create();
		WebResource resouce = client.resource("http://localhost:8080/06-WebserviceRestfull-server/rest/veiculo/"+codigo);
		
		ClientResponse response = resouce.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200){
			VeiculoTO to = response.getEntity(VeiculoTO.class);
			return to;
		}
		throw new Exception("Erro " + response.getStatus());
	}
	
	public void cadastrar(VeiculoTO to) throws Exception{
		Client client = Client.create();
		WebResource resouce = client.resource("http://localhost:8080/06-WebserviceRestfull-server/rest/veiculo");
		
		ClientResponse response = resouce.accept(MediaType.APPLICATION_JSON).type("application/json").post(ClientResponse.class,to);
		
		if(response.getStatus() != 201){
			throw new Exception("Erro " + response.getStatus());
		}
	}
	
	public void alterar(VeiculoTO to) throws Exception{
		Client client = Client.create();
		WebResource resouce = client.resource("http://localhost:8080/06-WebserviceRestfull-server/rest/veiculo/5");
		
		ClientResponse response = resouce.accept(MediaType.APPLICATION_JSON).type("application/json").put(ClientResponse.class,to);
		
		if(response.getStatus() != 200){
			throw new Exception("Erro " + response.getStatus());
		}
	}
	
	public void remover(int codigo) throws Exception{
		Client client = Client.create();
		WebResource resouce = client.resource("http://localhost:8080/06-WebserviceRestfull-server/rest/veiculo/"+codigo);
		
		ClientResponse response = resouce.accept(MediaType.APPLICATION_JSON).type("application/json").delete(ClientResponse.class);
		
		if(response.getStatus() != 200){
			throw new Exception("Erro " + response.getStatus());
		}
	}
}

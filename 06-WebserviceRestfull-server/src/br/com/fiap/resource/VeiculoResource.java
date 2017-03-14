package br.com.fiap.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.to.VeiculoBO;
import br.com.fiap.to.VeiculoTO;

@Path("/veiculo")
public class VeiculoResource {
	
	private VeiculoBO bo = new VeiculoBO();
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String olaVeiculo(){
		return "Olá Veículo";
	}*/
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public VeiculoTO getVeiculo(){
		return new VeiculoTO(1,"Veloster","Hyundai",80000.00);
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<VeiculoTO> listar(){
		return bo.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public VeiculoTO buscar(@PathParam("id")int id){
		return bo.buscar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(VeiculoTO veiculo, @Context UriInfo uriInfo){
		bo.cadastrar(veiculo);
		//devolver a url para consulta o viculo cadastrado
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(veiculo.getCodigo()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(VeiculoTO veiculo, @PathParam("id")int id){
		veiculo.setCodigo(id);
		bo.alterar(veiculo);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("{id}")
	public void excluir(@PathParam("id")int id){
		bo.remover(id);
	}
	
}

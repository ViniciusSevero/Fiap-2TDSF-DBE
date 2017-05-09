package br.com.fiap.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.CongressoBO;
import br.com.fiap.entity.Congresso;

@ManagedBean
public class ListaCongressoMB {
	private List<Congresso> congressos;
	
	private CongressoBO bo;
	
	@PostConstruct
	private void iniciar(){
		bo = new CongressoBO();
		congressos = bo.listar();
	}

	public List<Congresso> getCongressos() {
		return congressos;
	}

	public void setCongressos(List<Congresso> congressos) {
		this.congressos = congressos;
	}
	
	
}

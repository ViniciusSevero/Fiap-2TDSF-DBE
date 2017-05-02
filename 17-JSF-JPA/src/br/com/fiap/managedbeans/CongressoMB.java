package br.com.fiap.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.CongressoBO;
import br.com.fiap.entity.Congresso;
import br.com.fiap.exception.CommitErrorException;

@ManagedBean
public class CongressoMB {
	private Congresso congresso;
	private CongressoBO bo;
	
	@PostConstruct
	public void init(){
		congresso = new Congresso();
		bo = new CongressoBO();
	}
	
	public void cadastrar(){
		FacesMessage msg = null;
		try {
			bo.cadastrar(this.congresso);
			this.congresso = new Congresso();
			msg = new FacesMessage("Congresso cadastrado!");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
		} catch (CommitErrorException e) {
			e.printStackTrace();
			msg = new FacesMessage(e.getMessage());
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Congresso getCongresso() {
		return congresso;
	}

	public void setCongresso(Congresso congresso) {
		this.congresso = congresso;
	}
}
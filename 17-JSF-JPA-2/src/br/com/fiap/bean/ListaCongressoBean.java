package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import br.com.fiap.bo.CongressoBO;
import br.com.fiap.entity.Congresso;

@ManagedBean
public class ListaCongressoBean {

	private List<Congresso> congressos;
	private CongressoBO bo;
	private Congresso congresso;
	
	@PostConstruct
	public void iniciar(){
		bo = new CongressoBO();
		congressos = bo.listar();
	}
	public String excluir(int codigo){
		FacesMessage msg = null;	
		try {
			bo.remover(codigo);
			msg = new FacesMessage("Congresso exclu�do com sucesso");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("Erro!" + e.getMessage());
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		FacesContext.getCurrentInstance().getExternalContext()
		.getFlash().setKeepMessages(true);
		return "lista-congresso?faces-redirect=true";
	}

	public List<Congresso> getCongresso() {
		return congressos;
	}

	public void setCongresso(List<Congresso> congresso) {
		this.congressos = congresso;
	}
	
}

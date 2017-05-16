package br.com.fiap.bean;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.PalestranteBO;
import br.com.fiap.entity.Palestrante;
import br.com.fiap.exception.CommitErrorException;

@ManagedBean
public class PalestranteBean {

	private int codigo;
	private Palestrante p;
	private PalestranteBO bo;
	private List<Palestrante> lista;
	
	@PostConstruct
	public void init(){
		p = new Palestrante();
		bo = new PalestranteBO();
		lista = bo.listar();
		p.setDataNasc(Calendar.getInstance());
	}
	public String cadastrar(){
		FacesMessage msg = null;
		try {
			if(p.getCodigo() == 0){
				bo.cadastrar(p);
				msg = new FacesMessage("Cadastrado com sucesso");
				msg.setSeverity(FacesMessage.SEVERITY_INFO);
			}else{
				bo.atualizar(p);
				msg = new FacesMessage("Alterado 1com sucesso");
				msg.setSeverity(FacesMessage.SEVERITY_INFO);
			}
		} catch (CommitErrorException e) {
			msg = new FacesMessage("Erro");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		FacesContext.getCurrentInstance().getExternalContext()
		.getFlash().setKeepMessages(true);
		return "lista-palestrante?faces-redirect=true";
	}
	
	public String excluir(int codigo){
		FacesMessage msg;
		try {
			bo.remover(codigo);
			msg = new FacesMessage("Removido !");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("Erro ao remover!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		FacesContext.getCurrentInstance().getExternalContext()
		.getFlash().setKeepMessages(true);
		return "lista-palestrante?faces-redirect=true";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Palestrante getP() {
		return p;
	}
	public void setP(Palestrante p) {
		this.p = p;
	}
	public PalestranteBO getBo() {
		return bo;
	}
	public void setBo(PalestranteBO bo) {
		this.bo = bo;
	}
	public List<Palestrante> getLista() {
		return lista;
	}
	public void setLista(List<Palestrante> lista) {
		this.lista = lista;
	}
	
	
}

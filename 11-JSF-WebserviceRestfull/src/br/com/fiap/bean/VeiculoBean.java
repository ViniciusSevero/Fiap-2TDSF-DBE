package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.fiap.repository.VeiculoRepository;
import br.com.fiap.to.VeiculoTO;

@ManagedBean
@ViewScoped
public class VeiculoBean {
	private VeiculoTO veiculo;
	private List<VeiculoTO> veiculos;
	private VeiculoRepository rep;
	private int cod;
	
	@PostConstruct
	public void init(){
		 veiculo = new VeiculoTO();
		 rep = new VeiculoRepository();
	}
	
	public void cadastrar(){
		try {
			rep.cadastrar(veiculo);
			this.veiculo = new VeiculoTO();
			this.veiculos = null;
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.getMessage()));  
		}
	}
	
	public void buscar(){
		try{
			this.veiculos = new ArrayList<VeiculoTO>();
			VeiculoTO obj = rep.buscar(cod);
			if(obj != null)
				this.veiculos.add(obj);
			else
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Ve�culo n�o encontrado","Ve�culo n�o encontrado"));
		}catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Ve�culo n�o encontrado","Ve�culo n�o encontrado")); 
		}
	}

	public VeiculoTO getVeiculo() {
		return veiculo;
	}

	public List<VeiculoTO> getVeiculos() {
		if(this.veiculos == null){
			try {
				this.veiculos = rep.listar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return this.veiculos;
	}

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
}

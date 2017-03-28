package br.com.fiap.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fiap.repository.CompraRepository;
import br.com.fiap.to.CompraTO;

@ManagedBean
public class CompraBean {
	private CompraTO compra;
	private CompraRepository repository = new CompraRepository();
	private List<CompraTO> compras;
	
	public void cadastrar(){
		try {
			repository.cadastrar(compra);
			compras = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<CompraTO> getCompras() {
		if(this.compras == null){
			try {
				this.compras = repository.listar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return compras;
	}

	public CompraTO getCompra() {
		return compra;
	}

	public void setCompra(CompraTO compra) {
		this.compra = compra;
	}
}

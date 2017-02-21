package br.com.fiap.inventario;

import org.apache.axis2.AxisFault;

import br.com.fiap.beans.ProdutoTO;
import br.com.fiap.bo.EstoqueBO;

public class Estoque {
	
	public ProdutoTO buscarProduto(String codPoduto) throws AxisFault{
		ProdutoTO produto = EstoqueBO.consultarProduto(Integer.parseInt(codPoduto));
		if(produto == null){
			throw new AxisFault("Produto não cadastrado");
		}
		return produto;
	}
}

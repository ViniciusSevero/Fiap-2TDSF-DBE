package br.com.fiap.testes;

import br.com.fiap.inventario.EstoqueStub;
import br.com.fiap.inventario.EstoqueStub.BuscarProduto;
import br.com.fiap.inventario.EstoqueStub.BuscarProdutoResponse;

public class EstoqueTeste {
	public static void main(String[] args) {
		try{
			EstoqueStub bo = new EstoqueStub();
			BuscarProduto params = new BuscarProduto();
			params.setCodPoduto("1");
			BuscarProdutoResponse resp = bo.buscarProduto(params);
			System.out.println(resp.get_return().getTitulo());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

package br.com.fiap.bo;


import br.com.fiap.beans.ProdutoTO;

public class EstoqueBO {
	private static ProdutoTO[] produtos = new ProdutoTO[0];
	
	public static ProdutoTO consultarProduto(int codProduto){
		for (ProdutoTO produto : produtos) {
			if(produto.getCodigo() == codProduto){
				return produto;
			}
		}
		return null;
	}
	
	public static void add(ProdutoTO p){
		ProdutoTO[] aux = new ProdutoTO[produtos.length + 1];
		for (int i = 0; i < produtos.length; i++) {
			aux[i] = produtos[i];
		}
		aux[aux.length - 1] = p;
		produtos = aux;
	}
	
}

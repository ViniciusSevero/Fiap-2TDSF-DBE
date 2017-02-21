package br.com.fiap.bo;


import br.com.fiap.beans.ProdutoTO;

public class EstoqueBO {
	private static ProdutoTO[] produtos = new ProdutoTO[3];
	static{
		produtos[0] = new ProdutoTO(1, "PS4", 1350.00, 10);
		produtos[1] = new ProdutoTO(2, "XBOX ONE", 1150.00, 15);
		produtos[2] = new ProdutoTO(3, "NINTENDO WiiU", 1250.00, 20);
	}
	
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

package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.entity.Grupo;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscaGrupoTeste {
	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		
		Grupo g = new GrupoDAO(manager).buscar(1);
		System.out.println(g.getProjeto());
		
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}
	}
}

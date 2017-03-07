package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.dao.ProjetoDAO;
import br.com.fiap.entity.Grupo;
import br.com.fiap.entity.Projeto;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroGupoProjetoTeste {
	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		
		GenericDAO<Projeto, Integer> projetoDao = new ProjetoDAO(manager);
		GenericDAO<Grupo, Integer> grupoDao = new GrupoDAO(manager);
		
		try{
			Grupo g = new Grupo();
			g.setNome("FOX");
			//grupoDao.cadastrar(g);
			
			Projeto p = new Projeto();
			p.setDtInicio(Calendar.getInstance());
			p.setDtTermino(Calendar.getInstance());
			p.setObjetivo("Programar");
			p.setTema("Programação");
			p.setGrupo(g);
			projetoDao.cadastrar(p);
			
			projetoDao.salvar();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}
	}
}

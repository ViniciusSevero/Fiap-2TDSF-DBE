package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.dao.GenericDAO;
import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Grupo;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroAlunoGupoTeste {
	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		
		GenericDAO<Aluno, Integer> alunoDao = new AlunoDAO(manager);
		GenericDAO<Grupo, Integer> grupoDao = new GrupoDAO(manager);
		
		try{
			Grupo g = new Grupo();
			g.setNome("ABC");
			grupoDao.cadastrar(g);
			
			Aluno a1 = new Aluno();
			a1.setNome("Vinicius");
			a1.setGrupo(g);
			alunoDao.cadastrar(a1);
			
			Aluno a2 = new Aluno();
			a2.setNome("Calébe");
			a2.setGrupo(g);
			alunoDao.cadastrar(a2);
			
			Aluno a3 = new Aluno();
			a3.setNome("Kaio");
			a3.setGrupo(g);
			alunoDao.cadastrar(a3);
			
			alunoDao.salvar();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}
	}
}

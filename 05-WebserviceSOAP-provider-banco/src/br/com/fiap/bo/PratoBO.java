package br.com.fiap.bo;

import javax.persistence.EntityManager;
import org.apache.axis2.AxisFault;

import br.com.fiap.dao.PratoDAO;
import br.com.fiap.dao.PratoDAOImpl;
import br.com.fiap.entity.Prato;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class PratoBO {
	public void cadastrar(Prato prato) throws AxisFault{
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PratoDAO dao = new PratoDAOImpl(manager);
		dao.cadastrar(prato);
		try{
			dao.salvar();
		}catch (CommitErrorException e) {
			e.printStackTrace();
			throw new AxisFault("Erro");
		}finally {
			manager.close();
		}
	}
	
	public Prato buscar(int codigo){
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PratoDAO dao = new PratoDAOImpl(manager);
		return dao.buscar(codigo);
	}
}

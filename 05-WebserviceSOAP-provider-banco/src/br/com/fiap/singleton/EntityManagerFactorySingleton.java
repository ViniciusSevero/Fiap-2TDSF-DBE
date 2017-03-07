package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	//atributo estático
	private static EntityManagerFactory factory;
	
	//consrutor privado
	private EntityManagerFactorySingleton() {}	
	
	//getInstance
	public static EntityManagerFactory getInstance(){
		if(factory == null){
			factory =Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return  factory;
	}
}

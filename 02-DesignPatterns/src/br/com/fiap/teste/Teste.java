package br.com.fiap.teste;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.config.PropertySingleton;

public class Teste {
	private static Logger log = LoggerFactory.getLogger(Teste.class);
	
	public static void main(String[] args) {
		//Ler as propriedades do sistema
		Properties prop = PropertySingleton.getInstance();
		if(prop == null){
			log.error("Arquivo não encontrado");
		}else{
			log.debug("Ok!");
		}
		log.debug("Exibindo o application name da aplicação");
		System.out.println("Application_name : " + prop.getProperty("application_name"));
		log.debug("Exibindo a versão da aplicação");
		System.out.println("Versão : " + prop.getProperty("versao"));
		
	}
}

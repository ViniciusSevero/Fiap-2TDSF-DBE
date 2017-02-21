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
			log.error("Arquivo n�o encontrado");
		}else{
			log.debug("Ok!");
		}
		log.debug("Exibindo o application name da aplica��o");
		System.out.println("Application_name : " + prop.getProperty("application_name"));
		log.debug("Exibindo a vers�o da aplica��o");
		System.out.println("Vers�o : " + prop.getProperty("versao"));
		
	}
}

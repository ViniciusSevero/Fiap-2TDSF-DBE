package br.com.fiap.config;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {
	private static Properties prop;
	
	//Construtor privado, 
	private PropertySingleton(){}
	
	public static Properties getInstance(){
		if(prop == null){
			prop = new Properties();
			try{
				prop.load(PropertySingleton.class.getResourceAsStream("/config.properties"));
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return prop;
	}
}

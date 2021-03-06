package br.com.fiap.teste;

import org.apache.axis2.AxisFault;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalcularMedia;
import br.com.fiap.bo.CursoBOStub.CalcularMediaResponse;

public class CursoTeste {

	public static void main(String[] args) {
		try{
			//valores para o webservice
			CursoBOStub bo = new CursoBOStub();
			CalcularMedia valores = new CalcularMedia();
			valores.setNac(10);
			valores.setAm(10);
			valores.setPs(10);
			
			//chama webservice
			CalcularMediaResponse response = bo.calcularMedia(valores);
			
			float media = response.get_return();
			System.out.println(media);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

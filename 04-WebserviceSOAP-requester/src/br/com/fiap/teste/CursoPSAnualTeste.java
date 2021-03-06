package br.com.fiap.teste;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalcularMediaResponse;
import br.com.fiap.bo.CursoBOStub.CalcularPSAnual;
import br.com.fiap.bo.CursoBOStub.CalcularPSAnualResponse;

public class CursoPSAnualTeste {

	public static void main(String[] args) {
		try{
			CursoBOStub bo = new CursoBOStub();
			CalcularPSAnual params = new CalcularPSAnual();
			params.setMedia(10);
			params.setAm(10);
			params.setNac(10);
			CalcularPSAnualResponse resp = bo.calcularPSAnual(params);
			System.out.println(resp.get_return());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

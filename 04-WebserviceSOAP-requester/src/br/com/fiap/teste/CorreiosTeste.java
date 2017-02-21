package br.com.fiap.teste;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;


public class CorreiosTeste {

	public static void main(String[] args) {
	try{
		CalcPrecoPrazoWSStub bo = new CalcPrecoPrazoWSStub();
		CalcPrazo params = new CalcPrazo();
		params.setNCdServico("40010");
		params.setSCepDestino("06114000");
		params.setSCepOrigem("08420680");
		CalcPrazoResponse resp = bo.calcPrazo(params);
		System.out.println(resp.getCalcPrazoResult().getServicos().getCServico()[0].getPrazoEntrega());
	}catch(Exception e){
		e.printStackTrace();
	}

	}

}

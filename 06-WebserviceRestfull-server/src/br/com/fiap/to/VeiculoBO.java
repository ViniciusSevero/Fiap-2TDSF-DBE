package br.com.fiap.to;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VeiculoBO {
	
private static HashMap<Integer,VeiculoTO> banco = new HashMap<>();
	
	private static int sequence = 1;
	
	static{
		banco.put(sequence, new VeiculoTO(sequence++, "Azera", "Hyundai", 50000));
		banco.put(sequence, new VeiculoTO(sequence++, "Moby", "Fiat", 50000));
		banco.put(sequence, new VeiculoTO(sequence++, "Mustang", "Ford", 50000));
	}
	
	public void cadastrar(VeiculoTO veiculo){
		veiculo.setCodigo(sequence);
		banco.put(sequence++, veiculo);
	}
	
	public VeiculoTO buscar(int id){
		return banco.get(id);
	}
	
	public List<VeiculoTO> listar(){
		return new ArrayList<>(banco.values());
	}
	
	public void alterar(VeiculoTO veiculo){
		banco.put(veiculo.getCodigo(), veiculo);
	}
	
	public void remover(int codigo){
		banco.remove(codigo);
	}
	

}

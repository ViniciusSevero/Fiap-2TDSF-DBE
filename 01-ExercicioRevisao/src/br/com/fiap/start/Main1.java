package br.com.fiap.start;

import java.util.Calendar;

import br.com.fiap.beans.Livro;
import br.com.fiap.beans.Tablet;

public class Main1 {

	public static void main(String[] args) {
		Livro livro = new Livro(1,"Xablau",20, "William", "Ática", Calendar.getInstance());
		Tablet tablet = new Tablet(2, "Galaxy", 290, "", "Note Pro", "Android", true);
		
		System.out.println(livro);
		System.out.println(tablet);

	}

}

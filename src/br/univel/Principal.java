package br.univel;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		 
//		Desenho e = new ExK();
//		e.desenhar();		
		
		List<Desenho> lista = new ArrayList<>();
		
		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
		lista.add(new ExD());
		lista.add(new ExE());
		lista.add(new ExF());
		lista.add(new ExG());
		lista.add(new ExH());
		lista.add(new ExI());
		lista.add(new ExJ());
		lista.add(new ExK());
		//lista.add(new ExL());
		lista.add(new ExM());
		lista.add(new ExN());
		lista.add(new ExO());
		lista.add(new ExP());
		
		for (Desenho d: lista){
			d.desenhar();
		}

	}

}

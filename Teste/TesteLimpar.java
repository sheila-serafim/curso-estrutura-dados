package Teste;

import java.util.ArrayList;

import cursoEstruturaDeDados.Lista;

public class TesteLimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<String>(5);
		
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");
		
		System.out.println(arraylist);
		
		arraylist.clear();
		
		System.out.println(arraylist);
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
		
	}

}

package Teste;

import cursoEstruturaDeDados.Lista;

public class TesteRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");

		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);
	}

}

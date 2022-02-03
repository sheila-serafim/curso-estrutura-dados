package Teste;

import java.util.ArrayList;

import cursoEstruturaDeDados.Lista;

public class TesteUltimaPos {
	
	public static void main (String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>(5);		
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("A");
		
		System.out.println(arraylist.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
	}

}


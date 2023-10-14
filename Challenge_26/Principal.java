package com.hudoc.main;

public class Principal {

	public static void main(String[] args) {
		
		ListaEnlazada lista = new ListaEnlazada();
		
		lista.agregarItem(5);
		lista.agregarItem(6);
		lista.agregarItem(7);
		lista.agregarItem(8);
		int valor = 9;
		
		System.out.println("Esta el valor "+ valor + " dentro de la lista? : "+String.valueOf(lista.buscar(valor)));
		int r = lista.obtenerEn(6);
		System.out.println("resultado: "+String.valueOf(r));
		System.out.println("obteniendo un elemento ");
		System.out.println("Este es el valor en la posicion 2: "+lista.obtenerEn(2));
		System.out.println("Este es el valor en la posicion 0: "+lista.obtenerEn(0));
		valor = 7;
		System.out.println("Esta el valor "+valor+" en la lista? :"+lista.buscar(valor));
	}
	
	
}

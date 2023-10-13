package com.hudoc.main;

public class Principal {

	
	public static void main(String[] args)
	{
		ArbolBinario arbol = new ArbolBinario();
		ArbolBinario arbol1 = new ArbolBinario();
		
		arbol.agregar(10);
		arbol.agregar(15);
		arbol.agregar(20);
		arbol.agregar(25);
		arbol.agregar(30);
		
		arbol1.altura();
		
		System.out.println("La altura del arbol es: "+String.valueOf(arbol.altura()));
		System.out.println("La altura del arbol1 es: "+String.valueOf(arbol1.altura()));
		
	}
	
}

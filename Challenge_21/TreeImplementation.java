package com.hudoc.main;

public class TreeImplementation {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario tree = new ArbolBinario();
		
		/*
			Implementacion de arbol binario en java
			acciones implementadas: agregar y crear
			y su lectura en tres formas: in order, preorder y post order
		*/
		tree.agregar(1);
		tree.agregar(2);
		tree.agregar(3);
		tree.agregar(4);
		tree.agregar(5);
		System.out.println("Se hizo el arbol");
		
		System.out.println("Pre-orden: "+tree.lecturaPreOrden());
		System.out.println("In-orden: "+tree.lecturaInOrden());	
		System.out.println("Post-orden: "+tree.lecturaPostOrden());	
	}

}

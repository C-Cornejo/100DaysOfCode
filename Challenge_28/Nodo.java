package com.hudoc.main;

public class Nodo {

	int clave;
	Nodo derecha;
	Nodo izquierda;
	
	public Nodo(int clave) 
	{
		this.clave = clave;
		this.derecha = this.izquierda = null;
	}
}

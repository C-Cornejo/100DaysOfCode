package com.hudoc.main;

public class ListaEnlazada {
	
	private Nodo cabeza;
	private int conteo;
	
	public ListaEnlazada() 
	{
		this.cabeza = null;
		this.conteo = 0;
		
	}
	public int obtenerCuenta() 
	{
		return this.conteo;
	}
	
	public void agregarItem(int valor) 
	{
		if(cabeza == null) 
		{
			cabeza = new Nodo(valor);
		}
		else
		{
			Nodo nuevo = new Nodo(valor);
			nuevo.siguiente = cabeza;
			cabeza = nuevo;
		}
		conteo++;
	}
	
	
	public  boolean buscar(int valor) 
	{
		Nodo actual = cabeza;
		while(actual != null) 
		{
			if(actual.valor == valor) 
			{
				return true;
			}
			else 
			{
				actual = actual.siguiente;
			}
		}
	
	return false;	
	
	}
	public int obtenerEn(int pos) 
	{
		Nodo actual = cabeza;
		if(pos < 0 || pos >= this.conteo) 
		{
			return -2;
		}
		for(int i=0;i<= pos;i++) 
		{
			if(i == pos) 
			{
				return actual.valor;
			}
			actual = actual.siguiente;
		}
		
		return -1;
	}
	
	
}

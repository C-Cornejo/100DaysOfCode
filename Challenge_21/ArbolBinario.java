package com.hudoc.main;

public class ArbolBinario{

	
	private Nodo raiz;
	
	public ArbolBinario(){
		this.raiz = null;
	}
	
	public ArbolBinario(int valor) 
	{
		this.raiz = new Nodo(valor);
	}
	
	private Nodo agregarNodo(Nodo NodoRaiz,int valor) 
	{
		
		if(NodoRaiz != null) 
		{
				if(valor < NodoRaiz.valor){
					NodoRaiz.izquierdo = agregarNodo(NodoRaiz.izquierdo,valor);
				}else if(valor > NodoRaiz.valor)
				{
					NodoRaiz.derecho = agregarNodo(NodoRaiz.derecho,valor);
				}
		}
		else {
				NodoRaiz = new Nodo(valor);
		}
		return NodoRaiz;
	}// fin de agregarNodo

	
	
	private void preOrden(Nodo nodo,StringBuilder valores) 
	{
		if(nodo != null) 
		{
			valores.append(String.valueOf(nodo.valor)).append(",");
			preOrden(nodo.izquierdo,valores);
			preOrden(nodo.derecho,valores);
		}
	}
	
	private void inOrden(Nodo nodo,StringBuilder valores) 
	{
		if(nodo != null) 
		{
			inOrden(nodo.izquierdo,valores);
			valores.append(String.valueOf(nodo.valor)).append(",");
			inOrden(nodo.derecho,valores);
		}
	}
	
	private void postOrden(Nodo nodo,StringBuilder valores) 
	{
		if(nodo != null) 
		{
			postOrden(nodo.izquierdo,valores);	
			postOrden(nodo.derecho,valores);
			valores.append(String.valueOf(nodo.valor)).append(",");
		}
	}
	
	public void agregar(int valor) {
		// TODO Auto-generated method stub		
	    this.raiz = agregarNodo(raiz,valor);
	}
	
	public String lecturaPreOrden() 
	{
		StringBuilder resultado = new StringBuilder();
		 preOrden(raiz,resultado);
		 resultado.setLength(resultado.length() - 1); // quitamos la coma extra
		return resultado.toString();
	}
	public String lecturaInOrden() 
	{
		StringBuilder resultado = new StringBuilder();
		inOrden(raiz,resultado);
		 resultado.setLength(resultado.length() - 1); // quitamos la coma extra
		return resultado.toString();
	}
	public String lecturaPostOrden() 
	{
		StringBuilder resultado = new StringBuilder();
		 postOrden(raiz,resultado);
		 resultado.setLength(resultado.length() - 1); // quitamos la coma extra
		return resultado.toString();
	}
		
		
	}// fin de clase
	

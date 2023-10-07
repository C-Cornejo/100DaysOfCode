package com.hudoc.main;

public class ArbolBinario {

	
	private Nodo raiz;

	
	public ArbolBinario(int clave)
	{
		this.raiz = new Nodo(clave);
	}
	
	public ArbolBinario() 
	{
		this.raiz = null;
	}

	
	public void agregar(int valor) 
	{
		
		this.raiz = colocarNuevoNodo(raiz,valor);
		
	}

	private Nodo colocarNuevoNodo(Nodo nodoRaiz, int valor) {
		// TODO Auto-generated method stub
		
		if(nodoRaiz != null) 
		{
			/* si el nodo actual no esta vacio seguimos recorriendo los nodos los resultados van a
			a quedar desde donde llamemos a la recursion
			*/
			if(nodoRaiz.clave > valor) 
			{
				nodoRaiz.derecha = colocarNuevoNodo(nodoRaiz.derecha,valor);
			}else 
			{
				nodoRaiz.izquierda = colocarNuevoNodo(nodoRaiz.izquierda,valor);
			}
		}
		else
		{
			/*
			 * En cambio si el nodo actual esta vacio colocamos el valor en un nodo y dejamos la 
			 * referencia correspondiente
			 */
			nodoRaiz = new Nodo(valor);
		}
		return nodoRaiz;
	}
	
	public int altura() 
	{
		int result = recorrer(raiz);
		return result;
	}
	
	private int recorrer(Nodo nodoRaiz) {
		int altura = 1;
		//caso base es que sea null 
		// es decir que cuando sea null no operamos
		if(nodoRaiz != null) 
		{
	
			int subDerecha   = recorrer(nodoRaiz.derecha);
			int subIzquierda = recorrer(nodoRaiz.izquierda);

				
				if(subDerecha > subIzquierda) 
				{
					altura += subDerecha;
				}else 
				{
					altura += subIzquierda;
				}
				
		}else
		{
			return 0;
		}
		return altura;
	}
}

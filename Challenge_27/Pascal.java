package com.hudoc.main;

import java.util.Arrays;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * El codigo no es muy eficiente porque utiliza un arreglo bidimensional en vez de solo utilzar un arreglo unidimensinal y reemplazar los valores
		 * ademas se calcula todo el triangulo cuando se pide solo la fila n
		 * 
		 * */
		
		System.out.println("Imprimimos todo el triangulo de pascal: ");
		calcularFila(2);
		calcularFila(3);
		calcularFila(5);
		calcularFila(-3);
		calcularFila(13);
	}

	public static void imprimir(int[][] valores) 
	{
	
		for(int i=0;i < valores.length;i++) 
		{
			System.out.println(Arrays.toString(valores[i]));
		}
	}
	
	public static void calcularFila(int n) 
	{
		if(n <= 0)
		{
			System.out.println("Debe ingresar un valor de fila valido.");
		}
		else if(n == 1) 
			{
				System.out.println("[ 1 ]");
			}
		else if(n == 2) 
			{
				System.out.println("[1 , 1]");
			}else 
			{
				int[][] cuadricula = new int[n + 1][n + 1];
				
				cuadricula [0][0] = 1;
				
				cuadricula [1][0] = 1;
				cuadricula [1][1] = 1;
				
				int indice = 1; // iniciamos en la fila 2 - 1, representa el indice de fila en la que estamos escribiendo
				int terminos;
				if(n >= 3)
				{
					while(indice <= n) 
					{
						terminos = indice + 1; // cuantos terminos vamos a calcular
						cuadricula[indice][0] = 1; // el primer valor siempre es 1
						for(int i = 1;i< terminos;i++) 
						{
							cuadricula [indice][i] = cuadricula[indice - 1][i] + cuadricula[indice - 1][i - 1];
						}
						indice++;
					}
				}
				imprimir(cuadricula);
				imprimirFila(n,cuadricula[n]);
			}
		
		
	}// fin de calcular fila

	private static void imprimirFila(int n, int[] is) {
		// TODO Auto-generated method stub
		System.out.println("La fila " +n+" es: "+Arrays.toString(is));
		
	}
	
}

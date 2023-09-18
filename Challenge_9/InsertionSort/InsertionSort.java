package com.hudoc.main;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementacion de Insertion sort
		int[] nums = {34, 12, 43, 87, 23, 56, 91, 45, 76, 9, 67, 2, 88, 15, 50, 28, 71, 5, 64, 37, 18, 81, 3, 60, 29, 55, 78, 41, 16, 70, 31, 62, 27, 74, 48, 21, 94, 7, 69, 38, 83, 4, 66, 30, 63, 25, 59, 82, 40, 13, 86, 36, 72, 17, 90, 53, 75, 8, 49, 22, 97, 6, 68, 33, 65, 26, 61, 32, 73, 19, 85, 42, 11, 89, 44, 77, 52, 35, 10, 95, 1, 58, 24, 57, 80, 39, 14, 92, 47, 20, 84, 46, 79, 51, 96, 86};
		int[] asc = ordenamientoAsc(Arrays.copyOf(nums,nums.length));
		int[] desc = ordenamientoDesc(Arrays.copyOf(nums,nums.length));
		System.out.println("Metodo InsertionSort");
		//Imprimiendo de forma bonita la respuesta :3
		System.out.println("Input:");
		mostrar(nums); // Esta linea crea una copia del arreglo y lo manda como parametro
		//para no alterar el arreglo original
		
		System.out.println("Output asc:");
		mostrar(asc);
		
		System.out.println("Output desc:");
		mostrar(desc);
	}

	
	public static void mostrar(int[] d) 
	{
		System.out.print("[");
		for(int i=0;i< d.length;i++) 
		{
			if(i!= d.length-1) 
			{
				System.out.print(d[i]+",");
			}
			else 
			{
				System.out.print(d[i]);
			}
		}
		System.out.println("]");
	}
	
	public static int[] ordenamientoAsc(int[] datos){
		
		if(datos.length >= 2) 
		{
			int j;
			for(int i = 1;i < datos.length;i++) 
			{
				int menor = datos[i];
				j = i - 1;
				while(j >= 0 && datos[j] > menor) { // se recorre la parte ordenada del arreglo moviendo todos los elementos que sean mayores al elemento que estamos ubicando
											// dado que esta condicion comprueba si los otros elementos son mayores que el elemento de interes 
											// este ordenamiento es ascendente
					datos[j + 1] = datos[j];
					j--;
				}
				datos[j + 1]= menor;
			}
		
		}
		return datos;
	}
	
	public static int[] ordenamientoDesc(int[] datos) 
	{
		// validamos que sean mas de dos elementos
		if(datos.length >= 2) 
		{
			int k; // variable de control para recorrer la parte ordenada del arreglo
			for(int i = 1;i < datos.length;i++) 
			{
				// seleccionamos el elemento a ubicar
				int mayor = datos[i];
				k = i - 1; 
				while( k >= 0 && datos[k] < mayor)  // mientras el dato leido se menor que el que queremos ubicar (y tampoco el indice se salga del arrelgo) seguimos moviendo los elementos del arreglo 
				{
					datos[ k + 1] = datos[k]; // corremos el elemento actual hacia el siguiente
					k--; // avanzamos recorriendo la parte ordenada del arreglo
				}
				// una vez se termino la fase de moverlos elementos del arreglo
				// ubicamos el elemento donde dejamos el espacio
				datos[k + 1] = mayor; // asignamos el valor y repetimos todo el ciclo for
			}
		}
		return datos;
	}
	
	
}

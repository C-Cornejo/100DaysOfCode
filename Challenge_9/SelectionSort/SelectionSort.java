package com.hudoc.main;

import java.util.Arrays;

public class SelectionSort {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escriba un programa que arregle numeros utilizando el selection sort
	
		int[] nums = {34, 12, 43, 87, 23, 56, 91, 45, 76, 9, 67, 2, 88, 15, 50, 28, 71, 5, 64, 37, 18, 81, 3, 60, 29, 55, 78, 41, 16, 70, 31, 62, 27, 74, 48, 21, 94, 7, 69, 38, 83, 4, 66, 30, 63, 25, 59, 82, 40, 13, 86, 36, 72, 17, 90, 53, 75, 8, 49, 22, 97, 6, 68, 33, 65, 26, 61, 32, 73, 19, 85, 42, 11, 89, 44, 77, 52, 35, 10, 95, 1, 58, 24, 57, 80, 39, 14, 92, 47, 20, 84, 46, 79, 51, 96, 86};
		int[] resultado = ordenamiento(Arrays.copyOf(nums,nums.length));
		
		//Imprimiendo de forma bonita la respuesta :3
		System.out.println("Input:");
		mostrar(nums); // Esta linea crea una copia del arreglo y lo manda como parametro
		//para no alterar el arreglo original
		
		System.out.println("Output:");
		mostrar(resultado);
		
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
	
	public static int[] ordenamiento(int[] datos) 
	{
		if(datos.length >= 2) // si solo es un dato regresamos el mismo dato 
		{
			for(int i = 0;i < datos.length;i++) 
			{
				int menor = i;

				for(int j = i;j < datos.length;j++) 
				{
					if(datos[j] < datos[menor]) 
					{
						menor = j;  // almacenamos la posicion del elemento menor
					}
				}
				// intercambiamos el actual con el menor
				int temp = datos[i];     // almacenamos el numero actual en una variable temporal
				datos[i] = datos[menor]; // insertamos el menor en su lugar correcto
				datos[menor] = temp;     // colocamos el numero almacenado en el lugar donde estaba el menor
			}
			
		}
		return datos;
	}

}

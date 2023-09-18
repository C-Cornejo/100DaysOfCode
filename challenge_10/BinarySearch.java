package com.hudoc.main;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

	//Utilice el algoritmo de busqueda binaria para encontrar un numero en una lista de numeros ordenados
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Busqueda binaria");
		
		int valor = solicitar(sc); 
		//int[] nums = {33, 74, 51, 79, 13, 60, 67, 92, 31, 12, 57, 9, 30, 6, 4, 36, 88, 69, 82, 48, 27, 65, 59, 42, 16, 18, 61, 70, 81, 50, 22, 39, 10, 87, 71, 46, 76, 84, 14, 99, 25, 43, 35, 56, 7, 2, 17, 91, 19, 75, 55, 54, 24, 98, 15, 47, 37, 94, 72, 3, 73, 53, 38, 21, 95, 80, 28, 8, 1, 63, 97, 29, 66, 40, 23, 86, 96, 20, 5, 68, 45, 49, 62, 41, 11, 85, 58, 26, 64, 32, 34, 90, 77, 89, 78, 52, 44, 93, 100};
		int[] nums = {74, 13, 60, 67, 92, 31, 12, 57, 9, 30, 6, 4, 36, 88, 69, 82, 48, 27, 65, 59, 42, 16, 18, 61, 70, 81, 50, 22, 39, 10, 87, 71, 46, 76, 84, 14, 99, 25, 43, 35, 56, 7, 2, 17, 91, 19, 75, 55, 54, 24, 98, 15, 47, 37, 94, 72, 3, 73, 53, 38, 21, 95, 80, 28, 8, 1, 63, 97, 29, 66, 40, 23, 86, 96, 20, 5, 68, 45, 49, 62, 41, 11, 85, 58, 26, 64, 32, 34, 90, 77, 89, 78, 52, 44, 93, 100};
		int[] ordenados = ordenamientoAsc(Arrays.copyOf(nums, nums.length));
			
		mostrar(ordenados);
		int indice = binarySearch(valor,ordenados);
		
		if(indice != -1) 
		{
			 System.out.println("El indice es :"+indice);
			 System.out.println("El valor en el arreglo es: "+ ordenados[indice]);
		}
		else 
		{
			System.out.println("El valor no existe en el arreglo");
		}
		
	}
	
	public static int[] ordenamientoAsc(int[] datos) 
	{
		if(datos.length >= 2) 
		{
			for(int i = 1; i < datos.length;i++) 
			{
				int menor = datos[i];
				int j = i - 1;
				while(j >= 0 && datos[j] > menor) 
				{
					datos[j + 1] = datos[j];
					j--;
				}
				datos[j + 1] = menor;
			}
		}
		return datos;
	}
	
	public static int solicitar(Scanner sc) 
	{
		int valor = 0;
		do {
		System.out.println("Ingrese un numero a buscar");
		valor = sc.nextInt();
		
		}while(valor < 0 && valor <= 100);
		sc.nextLine(); // Leemos el buffer por si hay caracteres que sobraron
		return valor;
	}
	
	public static int binarySearch(int valor,int[] datos) 
	{
		 // primero seleccionamos mid
		int limite_der = datos.length - 1;
		int limite_izq = 0;
		
		while(limite_izq <= limite_der) 
		{
			int mid = limite_izq + ( (limite_der - limite_izq) / 2);
			if(datos[mid] == valor) {
				return mid;
			}
			if(datos[mid] < valor) 
			{
				limite_izq = mid + 1;
			}
			else 
			{
				limite_der = mid - 1;
			}
		}
	
		return -1;
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
}

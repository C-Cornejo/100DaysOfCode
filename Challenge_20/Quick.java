package com.hudoc.sort;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int datos[] = {7,3,2,5,6,9};
		int A[]= {10,9,8,7,6,5,4,3,2,1};
		System.out.println("Ordenando..");
		ordenar(datos,0,datos.length - 1);
		System.out.println("Array ordenado: "+Arrays.toString(datos));
	}
	
	public static void ordenar(int A[],int p, int r) 
	{
		quickSort(A,p,r);

	}
	public static void quickSort(int A[],int p, int r) 
	{
		int q;
		if(p < r) 
		{
			System.out.println("Sgt paso:  "+Arrays.toString(A));
			q = particion(A,p,r);
			System.out.println("comienza recursividad...");
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
	}
	
	public static int particion(int []A,int p, int r) 
	{
		int pivote = A[r];
		int i = p - 1;
		System.out.println("Se comienza con los valores p:"+ p +" y r:" + r);
		for(int j = p;j <= r - 1;j++) 
		{
			if(A[j] <= pivote) 
			{
				i = i + 1;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				System.out.println("Sgt paso:  "+Arrays.toString(A));
			} 
		}
		int aux = A[i + 1];
		A[i + 1] = A[r];
		A[r] = aux;
		
		System.out.print("Se cambia A[i+1]:"+A[i + 1]+" con A[r]: "+ A[r]);
		System.out.println(" Se devueve el valor " +(i+1)+" para q");
		return i + 1;
	}

}

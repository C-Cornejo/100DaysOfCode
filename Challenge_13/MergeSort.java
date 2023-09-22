package com.hudoc.main;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ordenamiento MergeSort");
		int nums[] = {26,783,265,83};
		System.out.println("Arreglo: " + Arrays.toString(nums));
		ordenar(nums,0,nums.length - 1);
		mostrar(nums);
	
	}
	public static void mostrar(int[] nums) 
	{
		System.out.print("[");
		
		for(int i=0;i < nums.length;i++) 
		{
			if(i != nums.length - 1) 
			{
				System.out.print(nums[i]+",");
			}else 
			{
				System.out.print(nums[i]);
			}
		}
		
		System.out.println("]");
	}
	
	public static void mezclar(int[] nums,int izq,int mid,int der) 
	{
		int sub_izq = mid - izq + 1; // tamaño del sub arreglo izquierdo
		int sub_der = der - mid; // tamaño del sub arreglo derecho
		
		int[] IZQ = new int[sub_izq];
		int[] DER = new int[sub_der];
		
		for(int i=0;i < sub_izq;i++) 
		{
			IZQ[i]=nums[izq + i];
		}
		
		for(int j = 0;j < sub_der;j++) 
		{
			DER[j]=nums[mid + 1 + j];
		}
		
		int i,j,k;
		i = j = 0;
		k = izq;
		
		while(i < sub_izq && j < sub_der) 
		{
			if(IZQ[i] <= DER[j]) 
			{
				nums[k]= IZQ[i];
				i++;
				
			}
			else 
			{
				nums[k] = DER[j];
				j++;
			}
			
			k++;
		}
		
		while(i < sub_izq) 
		{
			nums[k] = IZQ[i];
			i++;
			k++;
		}
		while(j < sub_der) 
		{
			nums[k] = DER[j];
			j++;
			k++;
		}
		
	}
	
	public static void ordenar(int[] nums,int izq, int der) 
	{
		if(izq < der) 
		{

			// los elementos izq y derecha son indices menor y mayor respectivamente
			int mitad = (izq + der )/ 2;
			
			 ordenar(nums,izq,mitad);
			 ordenar(nums,mitad+1,der);

			 mezclar(nums,izq,mitad,der);
		}
		
	}
}

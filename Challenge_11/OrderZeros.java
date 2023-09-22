package com.hudoc.main;

import java.util.Arrays;

public class OrderZeros {

	public static void main(String Args[]) 
	{
		//int[] nums = {9, 3, 8, 2, 7, 1, 6, 0, 4, 3, 5, 9, 8, 0, 6, 4, 7, 2, 1, 0, 5, 6, 1, 3, 7, 9, 2, 0, 8, 4, 5, 9, 6, 1, 0, 3, 7, 2, 8, 4, 5, 9, 6, 1, 0, 3, 7, 2, 8, 4, 5, 9, 6, 1, 0, 3, 7, 2, 8, 4, 5, 9, 6, 1, 0, 3, 7, 2, 8, 4, 5, 9, 6, 1, 0, 3, 7, 2, 8, 4, 5, 9, 6, 1, 0, 3, 7, 2, 8, 4, 5, 9, 6, 1};
		int[] nums = {0,0,1,1};
	
		System.out.println("El arreglo de valores es: ");
		mostrar(nums);
		
		System.out.println("Iteraciones: ");
		int[] resultado = ordenarCeros(Arrays.copyOf(nums, nums.length));
		
		
		System.out.println("El arreglo de valores ya ordenado es: ");
		mostrar(resultado);
		
	}
	
	public static void mostrar(int[] datos) 
	{
		System.out.print("[");
		for(int i = 0;i < datos.length; i++)
		{
			if(i != datos.length - 1) 
			{
				System.out.print(datos[i] + ",");
			}
			else 
			{
				System.out.print(datos[i]);
			}
		}
		System.out.println("]");
		
	}
	
	public static int[] ordenarCeros(int[] nums) 
	{
		int ultimo_numero = 0;
		for(int i = 0;i < nums.length;i++)
		{
			if(nums[i] != 0) 
			{
				int temp = nums[i];
				nums[i] = nums[ultimo_numero];
				nums[ultimo_numero] = temp;
				ultimo_numero++;
				
			}
		}
		return nums;
	}
	
}

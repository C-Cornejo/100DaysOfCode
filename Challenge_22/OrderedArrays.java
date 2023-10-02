package com.hudoc.main;

import java.util.Arrays;

public class OrderedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] A = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
		int[] B = {5,8,9,10,15,97,100,111,142};
		
		int[] result = merge(A,B);
		
		System.out.println("El resultado es: "+ Arrays.toString(result));
		
	}

	
	public static int[] merge(int[] arr_a,int[] arr_b) 
	{
		int cantidad = arr_a.length + arr_b.length;
		
		int[] resultado = new int[cantidad]; 
		int cuenta_a = 0;
		int cuenta_b = 0;
		int cuenta_r = 0;
		while(cuenta_a < arr_a.length && cuenta_b < arr_b.length) {
			
			if(arr_a[cuenta_a] <= arr_b[cuenta_b]) 
			{
				resultado[cuenta_r] = arr_a[cuenta_a];
				cuenta_a++;
				cuenta_r++;
			}else 
			{
				resultado[cuenta_r]=arr_b[cuenta_b];
				cuenta_b++;
				cuenta_r++;
			}
			
		}
		
		while(cuenta_a < arr_a.length) 
		{
			resultado[cuenta_r] = arr_a[cuenta_a];
			cuenta_a++;
			cuenta_r++;
		}
		
		while(cuenta_b < arr_b.length) 
		{
			resultado[cuenta_r]=arr_b[cuenta_b];
			cuenta_b++;
			cuenta_r++;
		}
		
		return resultado;
	}
}

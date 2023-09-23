package com.hudoc.main;

import java.util.Arrays;

public class Rotacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(nums));
		System.out.println("Rotaciones: ");

		rotar(nums,3);
	}

	public static void rotar(int[] datos,int posiciones)
	{
		int[] nums = new int[datos.length];
		
		for(int i = 0;i < datos.length;i++) 
		{
			int nueva_pos = (i + posiciones) % datos.length; // se obtiene el restante de la suma entre la cantidad de datos
			nums[nueva_pos] = datos[i];
		}
		
		System.out.println(Arrays.toString(nums));
	}

}

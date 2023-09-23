package com.hudoc.main;

import java.util.Arrays;

public class biggestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dado un arrelgo de numeros imprimir los tres numeros mas grandes;
		int[] nums = {3,4,2,5,76,4,1,7,8,54,32,47,19,99};
		
		buscar(nums);
	}

	public static void buscar(int[] datos) 
	{
		int menor, medio, mayor;
		
		menor = medio = mayor = datos[0];
		for(int i = 0;i < datos.length;i++) 
		{
			if(datos[i] > mayor) 
			{
				menor = medio;
				medio = mayor;
				mayor = datos[i];
			}else if(datos[i] > medio)
			{
				menor = medio;
				medio = datos[i];
			} else if(datos[i] > menor)
			{
				menor = datos[i];
			}
		}
		Arrays.toString(datos);
		System.out.println("mayor: "+ mayor +", medio: "+ medio +", menor: "+menor);
	}
	
	
}

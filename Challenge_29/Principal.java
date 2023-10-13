package com.hudoc.main;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sumando uno");
		//int[] d = {3,9,9};
		int[] d = {9};
		System.out.println(Arrays.toString(plusOne(d)));
		
	}
	
	public static int[] plusOne(int[] digitos) 
	{
		int j = digitos.length - 1;
		boolean lleva = true;
		while(j >= 0 && lleva) 
		{
			if(digitos[j] == 9) 
			{
				digitos[j] = 0;
				lleva = true;
			}
			else 
			{
				digitos[j]++;
				lleva = false;
			}
			j--;
		}
		if(lleva) 
		{
			int[] nuevo = new int[digitos.length + 1];
			nuevo[0]= 1;
			for(int i = 1;i< digitos.length;i++) 
			{
				nuevo[i] = digitos[i];
			}
			return nuevo;
		}
		return digitos;
	}

}

package com.hudoc.main;

public class RomanNumbers {

	public static void main(String[] Args) 
	{
		/*
		 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

			Symbol       Value
			I             1
			V             5
			X             10
			L             50
			C             100
			D             500
			M             1000
		 * */
		
		// Given a roman numeral, convert it to an integer.
		String romano = "mcmxciv"; 
		System.out.println("Valor: "+romano);
		int entero = romanToInt(romano);
		System.out.println("Numero: "+entero);
	}
	
	
	 public static int romanToInt(String s) {
	        s = s.toUpperCase().trim();
	        int cantidad = 0;
	        int tamano = s.length();
	        int[] nums =  new int[tamano];
	        for(int i =0; i < s.length() ;i++)
	        {
	            switch(s.charAt(i))
	            {
	                case 'I':
	                    nums[i] = 1;
	                break;
	                case 'V':
	                    nums[i] = 5;
	                break;
	                case 'X':
	                    nums[i] = 10;
	                break;
	                case 'L':
	                    nums[i] = 50;
	                break;
	                case 'C':
	                    nums[i] = 100;
	                break;
	                case 'D':
	                    nums[i] = 500;
	                break;
	                case 'M':
	                    nums[i] = 1000;
	                break;
	            }
	        }
	        for (int j=0 ;j<s.length();j++)
	        {
	            if(j == (s.length() -1)){
	                cantidad += nums[j]; // si es el ultimo solo se suma
	            }else
	            {
	                if(nums[j] < nums[j + 1])
	                {
	                    cantidad -= nums[j]; 
	                }else
	                {
	                    cantidad += nums[j];
	                }
	            }
	            
	        }
	        return cantidad;
	    }
}

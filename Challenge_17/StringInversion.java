package com.hudoc.main;
import java.util.Scanner;
import java.util.Stack;

public class StringInversion {

	

	public static void main(String[] Args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres:");
		
		String input = sc.nextLine();
		
		System.out.println(inversion(input));
	}
	
	public static String inversion(String input)
	{
		Stack<Character> pila = new Stack<Character>();
		String r = "";
		
		for(int i = 0;i < input.length();i++) 
		{
			pila.push(input.charAt(i));
		}
		
		for(int j=0;j < input.length();j++) 
		{
			if(!pila.isEmpty())
			{
				r += String.valueOf(pila.pop());
			}
			
		}
		
		return r;
	}
}

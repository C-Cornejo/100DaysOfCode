package com.hudoc.main;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] Args) 
	{
		//Un script donde se pida una cadena y se invierta
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese la cadena de caracteres: ");
				       // Se utiliza un InputStream -> System.in para capturar la entrada
				String invertida = "";						// con el obj Scanner
				char[] cadena;
				
				String s = sc.next(); 
								    
				
				cadena = s.toCharArray();				    // Convertimos la cadena a arreglo de caracteres para facilidad al recorrerlo
			
				for(int i = s.length() - 1; i >= 0; i--) {  // Recorremos el arreglos de caracteres de manera descendente
					invertida = invertida + cadena[i];      // Colocamos los ultimos caracteres de primer en una nueva variable
				}
				
				System.out.println("La cadena invertida es: "+invertida); //Mostramos el resultado
				
				/*
				 * Se puede omitir la utilizacion de un arreglo de caracteres por la siguiente linea
				 *  s.charAt(i); el cual devuelve el caracter en la posicion i
				 *  
				*/
	}
}

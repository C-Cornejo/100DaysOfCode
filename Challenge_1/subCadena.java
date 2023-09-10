package com.hudoc.main;

import java.util.Scanner;

public class subCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un parrafo(Presione Enter en una nueva linea para terminar): ");
		
		StringBuilder sb = new StringBuilder();
		String linea = "";
		
		while (!(linea = sc.nextLine()).isEmpty()) {
			sb.append(linea).append("\n");
		}
		
		String parrafo = sb.toString();
		
		System.out.println("Ingrese la cadena que desea encontrar: ");
		String palabra = sc.next();
		
		 String ANSI_RESET =    "\u001B[0m";
		 String ANSI_RED =   "\u001B[31m";
		
		String resultado = parrafo.replaceAll(palabra,ANSI_RED + palabra + ANSI_RESET);
		 
		System.out.println("Se encontro la palabra \n");
		System.out.println(resultado);
	}

}

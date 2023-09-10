package com.hudoc.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "",s2 = "", resultado= "";
		
		System.out.println("Ingrese la primera cadena de caracteres");
		s1 = sc.next();

		System.out.println("Ingrese la segunda cadena de caracteres");
		s2 = sc.next();
		
		resultado = s1 + s2;
		System.out.println("El resultado es: "+resultado);


	}
}

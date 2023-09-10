package com.hudoc.challenge_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static String RUTA_DIRECTORIO = System.getProperty("user.dir") + File.separator + "Diario";
	public static ArrayList<String> entradas;
	
	
	
	public static void main(String[] Args) {
		
		entradas = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in); 
		int option = 1;
		while(option != 0) 
		{
			System.out.println("\nWelcome to Challenge 1");
			System.out.println(" 1 - Invertir cadena \n 2 - Concatenar cadena \n 3 - buscar subcadena\n 4 - Leer un directorio \n 5 - Leer nombres desde un archivo \n 6 - diario \n 0 - Salir ");
			System.out.println("Seleccione una opcion: ");
			option = sc.nextInt();
			sc.nextLine(); // limpia el buffer por algun caracter rezagado
			
			switch(option) {
			case 1:
				pedirCadena(sc);
				break;
			case 2:
				//otro metodo
				unirCadena(sc);
				break;
			case 3:
				//otro metodo
				buscarCadena(sc);
				break;
			case 4:
				//otro metodo
				leerDirectorio(sc);
				break;
			case 5:
				//otro metodo
				leerArchivo(sc);
				break;
			case 6:
				
				//iniciarDiario(sc);
				break;
			case 0:
				option = 0;
				break;
			default:
					option = 1;
			}
		}
		
		sc.close();// Despues de terminar la ejecucion hay que cerrar el Stream 
		
		
		
	}//fin de main
	
	
	private static void leerArchivo(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("El archivo que tiene este programa contiene los siguientes nombres: ");
		String ruta = "datos/datos.txt";  // se agrega una carpeta de recursos y el archivo en la carpeta de recursos para poder utilizar ruta relativa
		String[] nombres = new String[100];
		int contador = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {  // Esta tipo de sentencia se llama try-with-resources
																			  // Permite a los recursos se liberen automaticamente
			String linea;													  // aun cuando entran en la clausula catch	
		
			while((linea = br.readLine())!= null) 
			{
				nombres[contador] = linea;
				contador++;
			}
			
			System.out.println("Se encontraron "+ (contador + 1) + " nombres");
			for(int i=0;i<contador;i++) {
				System.out.println((i+1)+" - "+ nombres[i]);
			}
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}


	private static void leerDirectorio(Scanner sc) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Escriba la ruta del directorio: ");
			String URI = sc.next();
			Path directorio = Paths.get(URI);
			
			DirectoryStream<Path> stream = Files.newDirectoryStream(directorio);
			for(Path archivo: stream) {
				System.out.println(archivo.getFileName());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void pedirCadena(Scanner sc) 
	{
		//Un script donde se pida una cadena y se invierta
		
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
	
	public static void unirCadena(Scanner sc) {

		String s1 = "",s2 = "", resultado= "";
		
		System.out.println("Ingrese la primera cadena de caracteres");
		s1 = sc.next();
		
		System.out.println("Ingrese la segunda cadena de caracteres");
		s2 = sc.next();
		
		resultado = s1 + s2;
		System.out.println("El resultado es: "+resultado);


	} // fin de unirCadena
	
	public static void buscarCadena(Scanner sc) {
		
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
	}//fin de buscarCadena
	

	
	
	
	
	
} // fin de class main

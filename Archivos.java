package com.hudoc.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("El archivo que tiene este programa contiene los siguientes nombres: ");
		String ruta = "datos/datos.txt";  			// se agrega una carpeta de recursos y el archivo en la carpeta de recursos para poder utilizar ruta relativa
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

}

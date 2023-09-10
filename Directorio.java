package com.hudoc.main;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Directorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Escriba la ruta del directorio: ");
			String URI = sc.next();
			Path directorio = Paths.get(URI);
			
			DirectoryStream<Path> stream = Files.newDirectoryStream(directorio);
			for(Path archivo: stream) {
				System.out.println(archivo.getFileName());
			}
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

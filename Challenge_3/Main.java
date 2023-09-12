package com.hudoc.challenge_3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	
	// Lista de cuentas creadas
	public static ArrayList<Cuenta> cuentas;
	
	// se implementa la politica de monto inicial
	public static final double MONTO_INICIAL = 25d; 
	// se implementa la politica del formato de id
	public static final long ID_INICIAL= 2500;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iniciamos el arreglo
		cuentas = new ArrayList<Cuenta>();
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		do
		{
			System.out.println("Mi banco SV - Bienvenido...");
			System.out.println(".: Menu :.");
			System.out.println(" 1 - Retirar.\n 2 - Depositar.\n 3 - Estado de cuenta.\n 4 - Crear Cuenta\n 5 - Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) 
			{
			case 1:
				retirarMonto(sc);
				break;
			case 2:
				depositarMonto(sc);
				break;
			case 3:
				mostrarEstado(sc);
				break;
			case 4:
				crearCuenta(sc);
				break;
			case 5:
				// salimos 
				break;
			default:
				opcion = 0;
				break;
			
			}//fin de switch
			
		}while(opcion != 5); 
		sc.close(); // Cerramos el Stream
	} // fin de main
	
	private static long solicitarId(Scanner sc) 
	{	
		long id = 0L;
		System.out.println("Ingrese el id de la cuenta a buscar: ");
		id = sc.nextLong();
		return id;
	}
	
	private static void retirarMonto(Scanner sc) {
		// TODO Auto-generated method stub
		long id = solicitarId(sc);
		Cuenta actual = getCuenta(id);
		System.out.println("");
		
		System.out.println("Cuanto desea retirar?");
		double monto = sc.nextDouble();
		if(actual.getFondos() <= monto) 
		{
			System.out.println("No es posible retirar esa cantidad...");
		}
		else 
		{
			if(actual.retirar(monto)) 
			{
				System.out.println("Retiro exitoso...");
			}else {
				System.out.println("Ocurrio un error...");
			}
		}
	}

	private static void depositarMonto(Scanner sc) {
		// TODO Auto-generated method stub
		long id = solicitarId(sc);
		Cuenta actual = getCuenta(id);

		System.out.println("Cuanto desea depositar?");
		double monto = sc.nextDouble();
		
		actual.depositar(monto);
		System.out.println("Deposito exitoso...");
	}

	private static void mostrarEstado(Scanner sc) {
		// TODO Auto-generated method stub
	
		
		long id;
		Cuenta actual = new Cuenta();
		id = solicitarId(sc);
		boolean existe = verificarExistencia(id);
		if(!existe) 
		{
			System.out.println("No existe la cuenta con ese codigo");
		}else {
			
			actual = getCuenta(id);
			actual.mostrar();
		}
		
	}
	private static Cuenta getCuenta(long id) 
	{
		Cuenta actual = new Cuenta();;
		for(Cuenta c: cuentas) 
		{
			if(c.getId() == id) {
				actual = c;
			}
		}
		return actual;
	}
	private static boolean verificarExistencia(long id) 
	{
		boolean bandera = false;
		for(Cuenta c: cuentas) 
		{
			if(c.getId() == id) {
				bandera = true;
			}
		}
		return bandera;
	}
	private static void crearCuenta(Scanner sc) {
		// TODO Auto-generated method stub
		Cuenta nueva = new Cuenta();
		String nombre;
		long nuevo_id = ID_INICIAL + cuentas.size();
		
		
		do {
			System.out.println("Ingrese el nombre del titular de la cuenta: ");
			nombre = sc.nextLine();
		}while( nombre == "" || nombre == null);

		nueva.setId(nuevo_id);
		nueva.setNombre(nombre);
		nueva.setFondos(MONTO_INICIAL);
		
		cuentas.add(nueva);
		System.out.println("Cuenta creada correctamente...");
	}

}

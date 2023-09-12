package com.hudoc.challenge_3;

public class Cuenta {
	
	private long id;
	private String nombre;
	private double fondos;
	
	public Cuenta() {};
	public Cuenta(long id,String nombre) {
		fondos = 0;
		this.id = id;
		this.nombre = nombre;
		
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return this.id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getName() {
		return this.nombre;
	}
	public double getFondos() {
		return this.fondos;
	}
	public void setFondos(double monto) 
	{
		this.fondos = monto;
	}
	
	public void depositar(double monto) {
		this.fondos += monto;
	}
	
	public boolean retirar(double monto) 
	{
		if(fondos < monto) {  // validar si se puede efectuar el retiro
			return false;    
		}
		fondos -= monto;
		return true;
	}
	
	public void mostrar() {
		
		System.out.println("Titular: "+this.nombre);
		System.out.println("ID: "+this.id);
		System.out.println("fondos: "+this.fondos);
	}
}

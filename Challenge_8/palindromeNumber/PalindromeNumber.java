package com.hudoc.main;

public class PalindromeNumber {

	
	
	public static void main(String Args[]) {
		System.out.println("Empezamos: ");
		
		int valor = 1112111;
		System.out.println("El valor  "+valor);
		
		boolean resp = esPalindromo(valor);
		System.out.println("Resuelve: "+resp);
	}
	public static boolean esPalindromo(int x) {
	       String numStr = Integer.toString(x);
	        int length = numStr.length();
	        int mid = length / 2;
	        System.out.println("La mitad es: "+mid);
	        for (int i = 0; i < mid; i++) {
	            char leftChar = numStr.charAt(i);
	            char rightChar = numStr.charAt(length - i - 1);

	            if(i != mid) {
	            	if(leftChar != rightChar) {
	            		return false;
	            	}
	            }
	        }

	        return true;
	    }
}

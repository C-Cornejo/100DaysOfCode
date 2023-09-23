package com.hudoc.main;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Verifica si la cadena ingresada es un palindromo o no
		//antes de verificar se hace una limpieza a la cadena removiendo todos los caracteres que no son alfa numericos
		
		  System.out.println("Cadena ingresada: race a car");
		  System.out.println("Respuesta: "+isPalindrome("race a car"));
	}

	 public static boolean isPalindrome(String s) {
	        
		 String clean_s = s.trim().replace(" ","").toLowerCase(); 
	        String result = "";
	        char current = ' ';
	        
	      // El siguiente for intenta limpiar la cadena de caracteres que no son alfanumericos
	      // pudo haberse utilizado la funcion replace con una regEx para evitar la creacion de la cadena result
	        for(int i = 0;i < clean_s.length();i++)
	        {
             current = clean_s.charAt(i);
     
               if((current >= 48 && current <= 57) || (current >= 97 && current <= 122))
                 {
                     result += String.valueOf(current);
                 }          
               
	        }
	       String inverted = "";
	       for(int i = result.length() - 1; i >= 0;i--)
	       {
	           inverted += String.valueOf(result.charAt(i));
	       }
	        return result.equals(inverted);
	    }
}

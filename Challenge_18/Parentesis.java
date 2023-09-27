package com.hudoc.main;
import java.util.Stack;


public class Parentesis {

	/* Escribe un programa que evalue si una expresion contiene parentesis balanceados
	 *
	 * es deciur que todo parentesis que se abra tenga su respectivo cierre
	 * 
	 *  Nota: Utiliza una pila
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str ={ "((()))[]{}","[]","[()]","[{()}]","[][]{}()","[","]","[()","[(])","	[{}()","[{]}"};
		
		
				
			for (int i = 0; i < str.length; i++) 
			{
				System.out.println("Esta balanceada la expresion "+ str[i] +"? :"+String.valueOf(check(str[i])));
			}	
		
		
	}
	
	public static boolean check(String exp) 
	{
		
		Stack<Character> pila = new Stack<Character>();
		
		for(int i=0;i<exp.length();i++) 
		{
			char actual = exp.charAt(i);
			switch(actual) 
			{
			case '(':		
			case '{':
			case '[':
				pila.push(actual);
				break;
			case ')':
					if(pila.isEmpty() || pila.peek() != '(') 
					{
						return false;
					}
					else
					{
						pila.pop();
					}
				break;
		
			case ']':
				if(pila.isEmpty() || pila.peek() != '[') 
				{
					return false;
				}
				else
				{
					pila.pop();
				}
				break;
			
			case '}':
				if(pila.isEmpty() || pila.peek() != '{') 
				{
					return false;
				}
				else
				{
					pila.pop();
				}
				break;
			default:
				
				break;
			}
		}
		
		return pila.isEmpty(); // si esta vacio la exp esta balanceada
	}

}

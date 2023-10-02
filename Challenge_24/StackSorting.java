package com.hudoc.sorting;
import java.util.Stack;

public class StackSorting {
	
	
	public static void main(String[] Args) 
	{
		Stack<Integer> datos= new Stack<Integer>();
		datos.push(43);
		datos.push(3);
		datos.push(40);
		datos.push(5);
		datos.push(29);
		datos.push(35);
		ordenarStack(datos);
		mostar(datos);
	}
	
	
	private static void mostar(Stack<Integer> datos) {
		// TODO Auto-generated method stub
		System.out.print("[");
		while(!datos.isEmpty()) 
		{
			System.out.print(String.valueOf(datos.pop())+",");
		}
		System.out.println("]");
	}


	public static void ordenarStack(Stack<Integer> s) 
	{
		
		// punto de entrada al a recursion
		if( !s.isEmpty() ) 
		{
			int current = s.pop();
			ordenarStack(s);
			colocar(s,current);
		}
		
	}
	
	public static void colocar(Stack<Integer> s,int item) 
	{
		if(s.isEmpty() || (item < s.peek())) 
		{
			//Evaluamos y volvemos a llamar a colocar
			s.push(item);
			return;
		}
		int temp = s.pop();
		colocar(s,item);
		s.push(temp);
	}
}

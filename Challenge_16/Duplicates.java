package com.hudoc.main;
import java.util.Arrays;
import java.util.Stack;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an integer array nums sorted in non-decreasing order, 
		 * remove the duplicates in-place such that each unique element appears only once. 
		 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
		 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
	     * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
		 * Return k.
		 * 
		 * */
		
		int[] nums = {1,2,2,3,4,4,5};
		System.out.println("El arreglo es: " + Arrays.toString(nums));
		System.out.println("Resultado :" + String.valueOf(removeDuplicates(nums)));
	}
	
	public static int removeDuplicates(int[] nums) 
	{
		
		Stack<Integer> pila = new Stack<Integer>();
		
		for(int i = 0; i < nums.length;i++) 
		{
			if(pila.isEmpty() || pila.peek() != nums[i]) {
				pila.push(nums[i]);
			}
		}
			int k = pila.size();
			for(int i = pila.size() - 1; i >= 0;i--)
			{
				nums[i] = pila.pop();
				
			}
			return k;
	}
}

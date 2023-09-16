package com.hudoc.main;

class TwoSums {

	
	/*
	 Given an array of integers nums and an integer target,
	  return indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution, 
	and you may not use the same element twice.
		You can return the answer in any order.
	 * */
   
	public static void main(String[] Args) {
		
		int[] nums =  {3,2,4};
		int[] resultado = new int[2];
		System.out.print("Arreglo: [");
		for(int c: nums) 
		{
			System.out.print(c+",");
		}
		System.out.println("]");
		System.out.println("Numero Objetivo: "+6);
		
		resultado = twoSum(nums,6);
		System.out.println("[0]: " + resultado[0]);
		System.out.println("[1]: " + resultado[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int limit = nums.length - 1;
        int[] r = new int[2];

        for(int i = 0; i < nums.length - 1;i++ ,limit--){

            for(int j = i; j < nums.length;j++)
            {
               if(i != j) 
               {
            	   int result = nums[i] + nums[j];
                   if(result == target){
                     r [0]= i;
                     r [1]= j;  
                   }
               }
            }
        }
        return r;     
    }
}
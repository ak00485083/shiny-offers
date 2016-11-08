package com.tutorial.excercise;

public class Multiples {
	
	static int getSumOfMultiples(){
		int sum=0;
		int i=3;
		int j=5;
		
		while(i<1000 ||j<1000){
			if(i<j){
				sum=sum+i;
				i=i+3;
			}
			else if(j<i){
				sum=sum+j;
				j=j+5;
			}
			else if(j==i){
				sum=sum+j;
				i=i+3;
				j=j+5;
			}
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println("sum is: "+getSumOfMultiples());
	}

}

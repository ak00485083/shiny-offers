package com.tutorial.excercise;

public class EvenFibonacciNumbers {
	  // recursive declaration of method fibonacci
	  public static long fibonacci(long number) {
	    if ((number == 1) || (number == 2)) // base cases
	      return number;
	    else
	      // recursion step
	      return fibonacci(number - 1) + fibonacci(number - 2);
	  }

	  public static void main(String[] args) {
		  long result=0;
	    for (int counter = 1; fibonacci(counter)<= 4000000 ; counter++){
	      System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
	      if(fibonacci(counter)%2==0)
	    result=result+fibonacci(counter);
	  }
	    System.out.println("the sum is ::"+result);
	  }
}

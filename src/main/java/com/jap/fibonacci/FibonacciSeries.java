package com.jap.fibonacci;

public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    int num1 = 0;
    int num2 = 1;
    int num3;
    public long fibonacci(long number) {

        if( number < 0){
            return -1;
        }
          else if(number > 0) {
            System.out.print(num3 + ", ");
            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;

            return fibonacci(number-1);
        }

        return num3;
    }
    // Print the series inside the method
    public void printFibonacciSeries(long number){
        FibonacciSeries fib = new FibonacciSeries();
       fib.fibonacci(number);
       // System.out.println("result = " + result);

    }
    public static void main( String[] args )
    {
        FibonacciSeries fib = new FibonacciSeries();
        // Call the  printFibonacciSeries() method and pass the value.
          long number = 9;
          fib.printFibonacciSeries(number);
          

    }
}

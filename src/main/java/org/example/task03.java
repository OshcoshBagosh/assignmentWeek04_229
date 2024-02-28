package org.example;
public class task03 {
    public static void main(String[] args){
        System.out.println(fib(10));
    }

    //The time complexity is O(2^n)
    //The amount of steps grow exponentially as n increases.
    //Since there are 2 functions of n incrementing, its O(2^n).
    static int fib(int n)

    {

        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n - 1) + fib(n - 2);

    }
}

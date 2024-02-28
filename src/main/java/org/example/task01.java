package org.example;

public class task01 {

    public static void main(String[] args){
        countDown(10);
    }

    //The time Complexity is O(n)
    //The function will repeatedly activate while num decreases by 1 until num becomes 0
    //So the function lasts n times
    static void countDown(int num)

    {

        if (num == 0) // test

            System.out.println("Blastoff!");

        else {
            // checks if num is even and prints if it is even.
            if (num % 2 == 0){
                System.out.println(num);
            }

            countDown(num-1); // recursive call

        }

    }
}

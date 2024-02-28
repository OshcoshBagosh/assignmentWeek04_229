package org.example;

public class task02 {
    public static void main(String[] args){
        System.out.println(gcd(90,75));
    }
    static int gcd(int x, int y) {
        //if x - y = 0, then the gcd is found
        if (x - y == 0) //base case

            return y;

        else
            //if x is less than y they switch positions
            if(x < y)
            {
                return gcd(y,x);
            }
            else{
                return gcd(x - y, y);
            }

    }
}

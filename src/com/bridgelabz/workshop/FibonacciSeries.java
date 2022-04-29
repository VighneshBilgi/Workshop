package com.bridgelabz.workshop;

import java.util.Scanner;

public class FibonacciSeries {
    // We define the 1st two terms of the Fibonacci series here

    static int FIB_0 = 0;
    static int FIB_1 = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        int fib[] = new int[n];

        if(n>2) {
            fib[0] = FIB_0;
            fib[1] = FIB_1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];

            }
        }

        System.out.println("Printing Fibonacci Series of " +n+" terms:");
        if (n == 1){
            System.out.println(FIB_0);
        } else if (n == 2) {
            System.out.println(FIB_0);
            System.out.println(FIB_1);
        }
        else {
            for (int j = 0; j < n; j++) {
                System.out.println(fib[j]);
            }
        }
    }
}

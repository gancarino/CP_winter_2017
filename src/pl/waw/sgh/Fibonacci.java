package pl.waw.sgh;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n==0)
            return 0;
        if ((n == 1) || (n == 2))
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {

        System.out.println("Please provide your Fibonacci number");
        int number = new Scanner(System.in).nextInt();
       /* int a = 0;
        int b = 1;
        int temp;*/
        System.out.println(number+"-ty wyraz ciagu Fibonacciego: "+fib(number));
        /*for (int i = 0; i < number; ++i) {
            temp = a;
            a = b;
            b = b + temp;
            System.out.println(i);
            System.out.println("temp=" + temp);
            System.out.println("a= " + a);
            System.out.println("b= " + b);
        }

        System.out.println(number + " Fibonacci number is " +
                a);*/
    }

}

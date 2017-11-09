package pl.waw.sgh;

import java.util.Scanner;

public class BowlingGame {
        public static void main(String[] args) {
            System.out.println(" Please provide your number of rows ");
            int n = new Scanner(System.in).nextInt();
            int b=0;
            for (int i = 1; i <= n; i++) {
                b=b+i;
            }
            System.out.println(b);
        }
    }


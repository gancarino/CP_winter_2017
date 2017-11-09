package pl.waw.sgh;

    import java.util.Scanner;

    public class PrimeNumber {
        public static void main(String[] args) {
            System.out.println(" Please provide your prime number");
            int number = new Scanner(System.in).nextInt();
            int x=0;
            for (int i = 2; i <= number/2; i++) {
                if ((number % i)==0) {
                    x++;
                    if(x>0) break;
                }}
            if (x==0 && number>1 ) {
                System.out.println("this is a prime number");
            } else
                System.out.println("this is not a prime number");
        }
    }


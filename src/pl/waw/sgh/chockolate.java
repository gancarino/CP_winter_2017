package pl.waw.sgh;
import java.util.Scanner;

public class chockolate {
    public static int makeChocolate(int small, int big, int goal) {
        int b=5; // jedna duża czekolada kosztuje 5 jednostek czekolady
        int c=-1;
        int wb=big*b; // obliczenie jednostek dużej czekolady
        int x=goal%b;
        int z=goal-wb;
        System.out.println();
        if (wb>=goal && x<=small) {
            return x;
                /*System.out.println("Twoja liczba malych czekolad to"+ x);*/
        }
        else if (wb<goal && z<=small){
            return z;
               /* System.out.println("Twoja liczba małych czekolad to"+ z);*/
        }
        else {
            return c;
                /*System.out.println("Nie jesteś w stanie nic stworzyc twoja liczba = "+c);*/
        }
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe oczekiwanych małych czekolad  ");
        int small = new Scanner(System.in).nextInt();
        System.out.println("Podaj liczbe oczekiwanych dużych czekolad  ");
        int big = new Scanner(System.in).nextInt();
        System.out.println("Podaj ilość jednostek dostępnej czekolady  ");
        int goal = new Scanner(System.in).nextInt();

        chockolate CreateChockolate = new chockolate();
        CreateChockolate.makeChocolate(small,big,goal);
        System.out.println("Twoja liczba małych czekolad to " + makeChocolate(small,big,goal ) );

    }

}

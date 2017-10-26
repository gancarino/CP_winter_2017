package pl.waw.sgh;

import java.util.Scanner;

public class CheckProfit {

    public static void main(String[] args) {
        double cost;
        double sell;
        int unitsSold;
        double loss;
        double profit;

        System.out.println("Plese provide unit cost: ");
        cost = new Scanner(System.in).nextDouble();
        System.out.print("Please provide selling price: ");
        sell = new Scanner(System.in).nextDouble();
        System.out.print("Please provide units sold ");
        unitsSold = new Scanner(System.in).nextInt();
        loss = (cost-sell)*unitsSold;
        profit = (sell-cost)*unitsSold;


        if (cost > sell) {
            System.out.println("the loss is " + loss);
        } else if (cost == sell) {
            System.out.println("the balance is zero " + profit);
        }
        else {
            System.out.println("the profit is " + profit);
        }
    }
}

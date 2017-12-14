package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer c1 = bank.createCustomer("Anna", "Brown", "anna@ex.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@ex.com");

        Account acc1 = bank.createDebitAccount(c1);
        acc1.deposit(252);
        Account acc2 = bank.createSavingsAccount(c1);
        acc2.deposit(300);
        acc2.charge(150);
        Account acc3 = bank.createDebitAccount(c2);
        acc3.charge(150);
        Account acc4 = bank.createSavingsAccount(c2);
        bank.transfer(1,0,80);

        System.out.println(bank);
    }
}


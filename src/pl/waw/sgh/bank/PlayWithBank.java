package pl.waw.sgh.bank;

import pl.waw.sgh.bank.Exceptions.BankException;
import pl.waw.sgh.bank.Exceptions.NonExistantAccountException;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) /*throws NonExistantAccountException*/ {
        Bank bank = new Bank();

        Customer c1 = bank.createCustomer("Anna", "Brown", "anna@ex.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@ex.com");

        Account acc1 = bank.createDebitAccount(c1);
        Account acc2 = bank.createSavingsAccount(c1);

        Account acc3 = bank.createDebitAccount(c2);

        Account acc4 = bank.createSavingsAccount(c2);

        try {
            acc1.deposit(252);
            acc2.deposit(300);
            acc2.charge(150);
            acc3.charge(150);
            bank.transfer(0, 1, 253);
            System.out.println(bank);
        } catch (Exception ne) {
            System.out.println("sth went wrong ...." + ne.getMessage());
        }
    }
}


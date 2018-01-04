package pl.waw.sgh.bank;

import pl.waw.sgh.bank.Exceptions.BankException;
import pl.waw.sgh.bank.Exceptions.InvalidSumException;
import pl.waw.sgh.bank.Exceptions.NonExistantAccountException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();

    private Integer lastCustomerID = 0;

    private Integer lastAccountID = 0;

    private  Account findAccountByID(Integer id)  throws NonExistantAccountException {
        for (Account tempAcc : accountList) {
            if(tempAcc.getAccountID().equals(id)) return tempAcc;
        }
        /*return null;*/
        throw new NonExistantAccountException("Account ID: "+ id + " does not exist ");
    }

    public void transfer (Integer fromAccID, Integer toAccID, double amount) throws BankException {
        double d = Double.valueOf(String.valueOf(findAccountByID(fromAccID).getBalance()));
        Account fromAccount = findAccountByID(fromAccID);
        Account toAccount = findAccountByID(toAccID);
        if (d >= amount) {
            System.out.println(" Balans konta to " + d);
            fromAccount.charge(amount);
            toAccount.deposit(amount);
        } else {
             System.out.println(" transfer is not possible from Account " + fromAccID);
        }
    }

    public Customer createCustomer(String firstName,
                                   String lastName, String email) {
        Customer customer =
                new Customer(lastCustomerID++,firstName,lastName,email);
        customerList.add(customer);
        return customer;
    }

    private Account createAccount(Customer customer, boolean isSavings) {
        Account acc =
                (isSavings ?
                        new SavingsAccount(lastAccountID++, 0d, customer)
                        :
                        new DebitAccount(lastAccountID++,0d,customer));
        accountList.add(acc);
        return acc;
    }

    public Account createSavingsAccount(Customer customer) {
        return createAccount(customer, true);
    }

    public Account createDebitAccount(Customer customer) {
        return createAccount(customer, false);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "custs=\n" + customerList +
                ",\n accs=\n" + accountList +
                '}';
    }
}
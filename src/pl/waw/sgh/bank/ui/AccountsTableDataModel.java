package pl.waw.sgh.bank.ui;


import pl.waw.sgh.bank.Account;

import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AccountsTableDataModel extends DefaultTableModel {

    static String[] cols = {"ID", "Type", "Currency", "Balance"};

    private List<Account> accountList = new ArrayList<>();

    public Account getAccountByRow(int i) {
        return accountList.get(i);
    }

    private Vector getVectorFromAccount(Account acc) {
        Vector vector = new Vector();
        vector.add(acc.getAccountID());
        vector.add(acc.getClass().getSimpleName().replace("Account", ""));
        vector.add(acc.getCurrency());
        vector.add(acc.getBalance());
        return vector;
    }

    public AccountsTableDataModel(List<Account> accountList) {
        super(cols, 0);
        addRows(accountList);
    }

    public void addRows(List<Account> accountList) {
        for (Account acc : accountList) {
            addRow(acc);
        }
    }

    public void addRow(Account acc) {
        accountList.add(acc);
        addRow(getVectorFromAccount(acc));
        fireTableDataChanged();
    }

    public void removeAllRows() {
        dataVector.clear();
        accountList.clear();
        fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        dataVector.remove(rowIndex);
        accountList.remove(rowIndex);
        fireTableDataChanged();
    }

    // Disable editing data in a table
/*
    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }
*/

    @Override
    public Class getColumnClass(int colIndex) {
        switch (colIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return BigDecimal.class;
            default:
                return Object.class;
        }
    }

    @Override
    public void setValueAt(Object newVal, int row, int column) {
        super.setValueAt(newVal,row,column);
        Account account = (Account) accountList.get(row);
        switch (column) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                account.setCurrency((String) newVal);
                return;
            case 3:
                account.setBalance((BigDecimal) newVal);
        }
    }
}
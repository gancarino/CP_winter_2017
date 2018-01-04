package pl.waw.sgh.bank.Exceptions;

public class NonExistantAccountException extends BankException {

    public NonExistantAccountException(String s) {
        super(s);
    }
}

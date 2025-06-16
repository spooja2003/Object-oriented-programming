//package object_oriented_programming;

public class Bank {
    private String accountHolderName;
    private int balance;
    private String accountNumber;

    Bank(String accountHolderName, int initialbalance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = initialbalance;
        this.accountNumber = accountNumber;
    }

}

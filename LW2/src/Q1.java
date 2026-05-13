import java.util.Scanner;

class Account {
    private String ownerName;
    private double balance;

    public Account() {
        ownerName = "Unassigned";
        balance = 0.0;
    }

    public void add(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    public void deduct(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        }
    }

    public double getCurrentBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setInitialBalance(double bal) {
        if (bal >= 0) {
            balance = bal;
        }
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setOwnerName("Suneth");
        acc.setInitialBalance(5000);

        acc.add(1000);
        acc.deduct(2000);

        System.out.println(acc.getOwnerName() + " has balance: " + acc.getCurrentBalance());
    }
}
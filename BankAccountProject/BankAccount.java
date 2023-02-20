public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount() {
        ownerName = null;
        balance = 0;
    }

    public BankAccount(String n, double b) {
        ownerName = n;
        balance = b;
    }

    public void deposit(double d) {
        balance += d;
        System.out.println(ownerName + " Deposited $" + d);
    }

    public void withdraw(double w) {
        balance -= w;
        System.out.println(ownerName + " Withdrew $" + w);
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setOwnerName(String newName) {
        ownerName = newName;
    }

    public String toString() {
        return ownerName + " $" + balance;
    }

    public BankAccount compare(BankAccount first, BankAccount second) {
        if (first.getBalance() > second.getBalance()) {
            return first;
        } else {
            return second;
        }
    }
}

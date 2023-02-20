public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount sean = new BankAccount("Sean Dean", 1000);
        BankAccount ethan = new BankAccount("Ethan Jack", 750);
        BankAccount kellie = new BankAccount("Kellie Bonita", 1500);

        sean.deposit(200);
        sean.withdraw(500);

        ethan.withdraw(750);

        kellie.deposit(30);
        kellie.withdraw(400);

        System.out.println(sean.getBalance());
        System.out.println(ethan.getBalance());
        System.out.println(kellie.getBalance());
    }
}

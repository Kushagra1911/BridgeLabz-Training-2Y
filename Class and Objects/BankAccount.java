class BankAccount {
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Riya", 12345, 10000);
        b.deposit(2000);
        b.withdraw(5000);
        b.displayBalance();
    }
}

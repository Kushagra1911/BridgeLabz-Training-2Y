class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println(accountNumber + " " + accountHolderName + " " + bankName + " " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Amit", 10101, 5000);
        b.display();
        BankAccount.getTotalAccounts();
    }
}

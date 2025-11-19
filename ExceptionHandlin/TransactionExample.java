package exceptionsdemo;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class Transaction {
    void doTransaction(int amount) throws NegativeAmountException,
            InsufficientFundsException, NetworkFailureException {

        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative.");
        }

        int random = (int) (Math.random() * 3);

        if (random == 0)
            throw new InsufficientFundsException("Not enough balance.");
        if (random == 1)
            throw new NetworkFailureException("Network error occurred.");

        System.out.println("Transaction Successful!");
    }
}

public class TransactionExample {
    public static void main(String[] args) {

        Transaction t = new Transaction();

        try {
            t.doTransaction(5000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

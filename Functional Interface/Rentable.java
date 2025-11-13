import java.util.Random;


class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}


class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

public class OnlineOrderProcessor {

    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int outcome = rand.nextInt(3); 

        switch (outcome) {
            case 1:
                throw new OutOfStockException("Sorry, the product is currently out of stock.");
            case 2:
                throw new PaymentFailedException("Payment processing failed. Please try again.");
            default:
                System.out.println("✅ Order placed successfully!");
        }
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }
    }
}
 
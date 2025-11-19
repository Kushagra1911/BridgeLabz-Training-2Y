package exceptionsdemo;

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

class Order {
    void placeOrder() throws OutOfStockException, PaymentFailedException {
        int random = (int) (Math.random() * 2); // 0 or 1

        if (random == 0) {
            throw new OutOfStockException("Product is out of stock.");
        } else {
            throw new PaymentFailedException("Payment failed.");
        }
    }
}

public class OrderExample {
    public static void main(String[] args) {
        Order order = new Order();

        try {
            order.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
    }
}


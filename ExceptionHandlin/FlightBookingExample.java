package exceptionsdemo;

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String msg) { super(msg); }
}

class PaymentFailedEx extends Exception {
    public PaymentFailedEx(String msg) { super(msg); }
}

class FlightBooking {

    void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("Seat not available.");
    }

    void processPayment() throws PaymentFailedEx {
        throw new PaymentFailedEx("Payment failed.");
    }

    void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
    }
}

public class FlightBookingExample {
    public static void main(String[] args) {

        FlightBooking f = new FlightBooking();

        try {
            f.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("Seat Issue: " + e.getMessage());
        } catch (PaymentFailedEx e) {
            System.out.println("Payment Issue: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Issue: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}

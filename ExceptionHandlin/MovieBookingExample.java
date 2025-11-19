package exceptionsdemo;

import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String msg) { super(msg); }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String msg) { super(msg); }
}

class MovieBooking {
    Map<Integer, Boolean> seats = new HashMap<>();

    MovieBooking() {
        for (int i = 1; i <= 10; i++) {
            seats.put(i, false); // all seats empty
        }
    }

    void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat does not exist.");

        if (seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat already booked.");

        seats.put(seatNo, true);
        System.out.println("Seat booked: " + seatNo);
    }
}

public class MovieBookingExample {
    public static void main(String[] args) {

        MovieBooking booking = new MovieBooking();

        try {
            booking.bookSeat(15); // invalid seat
        } catch (Exception e) {
            System.out.println("Booking error: " + e.getMessage());
        }
    }
}

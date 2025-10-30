class HotelBooking {
    String guestName;
    String roomType;
    int nights;


    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Aakash", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);

        System.out.println(h2.guestName + " " + h2.roomType + " " + h2.nights);
    }
}

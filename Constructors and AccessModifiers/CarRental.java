class CarRental {
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * 1000;
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Karan", "Honda City", 4);
        System.out.println(c.totalCost());
    }
}

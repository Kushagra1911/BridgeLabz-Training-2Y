class Product {
    static double discount = 10;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display() {
        if (this instanceof Product) {
            double total = (price * quantity) - (price * quantity * discount / 100);
            System.out.println(productID + " " + productName + " " + total);
        }
    }

    public static void main(String[] args) {
        Product p = new Product(1, "Shoes", 2000, 2);
        p.display();
        Product.updateDiscount(20);
        p.display();
    }
}

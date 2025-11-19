class CartItem {
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    void add(int q) {
        quantity += q;
    }

    void remove(int q) {
        if (quantity >= q) quantity -= q;
    }

    void totalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Shirt", 800, 2);
        c.add(1);
        c.remove(1);
        c.totalCost();
    }
}

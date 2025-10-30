class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display(int qty) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Total Cost: " + (price * qty));
    }

    public static void main(String[] args) {
        Item i = new Item(1001, "Pen", 10);
        i.display(5);
    }
}

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    Product(String n, double p, double r) { name=n; price=p; rating=r; }
    public String toString() { return name+" ₹"+price+" ⭐"+rating; }
}

public class SortProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 55000, 4.5),
            new Product("Phone", 20000, 4.7),
            new Product("Watch", 3000, 4.0)
        );

        System.out.println("Sort by Price:");
        products.sort((a, b) -> Double.compare(a.price, b.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        products.forEach(System.out::println);
    }
}

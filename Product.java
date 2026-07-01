public class Product {
    String productName;
    int price;

    Product(String name, int p) {
        productName = name;
        price = p;
    }

    void showDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 20000);

        p1.showDetails();
        p2.showDetails();
    }
}

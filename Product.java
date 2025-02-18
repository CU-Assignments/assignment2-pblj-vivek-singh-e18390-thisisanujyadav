class Product1 {

    private int id;
    private String name;
    private double price;

    public Product1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Product {
    public static void main(String[] args) {
        Product1 product = new Product1(101, "Laptop", 75000);

        product.displayDetails();
    }
}

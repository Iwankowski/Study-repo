import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StorageSystem {
    private List<Product> products;

    public StorageSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void displayProducts() {
        System.out.println("Products in storage:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    public static void main(String[] args) {
        StorageSystem storage = new StorageSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Display products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter the product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the product price: ");
                    double price = scanner.nextDouble();
                    storage.addProduct(new Product(name, price));
                    break;
                case 2:
                    storage.displayProducts();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

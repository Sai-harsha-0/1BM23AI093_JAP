import java.util.ArrayList;

class product {
    String name;
    double price;
    String category;

    public product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

class onlineShoppingManager {
    private final ArrayList<product> inventory;

    public onlineShoppingManager() {
        inventory = new ArrayList<>();
    }

    public void addProduct(String name, double price, String category) {
        product product = new product(name, price, category);
        inventory.add(product);
    }

    public void removeProduct(String name) {
        inventory.removeIf(product -> product.name.equalsIgnoreCase(name));
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (product product : inventory) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category);
        }
    }

    public static void main(String[] args) {
        onlineShoppingManager manager = new onlineShoppingManager();
        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("T-shirt", 550, "Clothing");
        manager.addProduct("Book", 920, "Books");
        manager.displayInventory();
        manager.removeProduct("Book");
        manager.displayInventory();
        manager.removeProduct("Laptop");
        manager.displayInventory();
    }
}
/*
Name: Laptop, Price: 40000.0, Category: Electronics
Name: T-shirt, Price: 550.0, Category: Clothing
Name: Book, Price: 920.0, Category: Books
Inventory:
Name: Laptop, Price: 40000.0, Category: Electronics
Name: T-shirt, Price: 550.0, Category: Clothing
Inventory:
Name: T-shirt, Price: 550.0, Category: Clothing
 */


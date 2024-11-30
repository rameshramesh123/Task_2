
package taskoops;
import java.util.Scanner;


public class XYZ {
    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 products
        Product[] products = new Product[5];

        // Accept 5 product details from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + " (pid, price, quantity):");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();

            // Create a product and add it to the array
            products[i] = new Product(pid, price, quantity);
        }

        // Find the product ID (pid) with the highest price
        int maxPricePid = products[0].getPid();
        double maxPrice = products[0].getPrice();

        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPricePid = product.getPid();
            }
        }

        System.out.println("Product ID with the highest price: " + maxPricePid);

        // Calculate and display the total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);


    }
}

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input city, product, and quantity
        System.out.print("Enter city (Sofia, Plovdiv, Varna): ");
        String city = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter product (coffee, water, beer, sweets, peanuts): ");
        String product = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();

        // Define prices for each city and product
        double price = 0;

        if (city.equals("sofia")) {
            switch (product) {
                case "coffee": price = 0.50; break;
                case "water": price = 0.80; break;
                case "beer": price = 1.20; break;
                case "sweets": price = 1.60; break;
                case "peanuts": price = 1.50; break;
                default: System.out.println("Invalid product."); return;
            }
        } else if (city.equals("plovdiv")) {
            switch (product) {
                case "coffee": price = 0.40; break;
                case "water": price = 0.70; break;
                case "beer": price = 1.15; break;
                case "sweets": price = 1.30; break;
                case "peanuts": price = 1.50; break;
                default: System.out.println("Invalid product."); return;
            }
        } else if (city.equals("varna")) {
            switch (product) {
                case "coffee": price = 0.45; break;
                case "water": price = 0.70; break;
                case "beer": price = 1.10; break;
                case "sweets": price = 1.35; break;
                case "peanuts": price = 1.55; break;
                default: System.out.println("Invalid product."); return;
            }
        } else {
            System.out.println("Invalid city.");
            return;
        }

        // Calculate total price
        double totalPrice = price * quantity;
        System.out.printf("Total price: %.2f", totalPrice);

        scanner.close();
    }
}
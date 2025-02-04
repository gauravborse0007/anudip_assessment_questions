import java.util.Scanner;

public class TradeCommission {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input city and sales volume
        System.out.print("Enter city (Sofia, Varna, Plovdiv): ");
        String city = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter sales volume: ");
        double salesVolume = scanner.nextDouble();

        // Define commission rates for each city and sales range
        double commissionRate = 0;

        // Check if sales volume is negative
        if (salesVolume < 0) {
            System.out.println("error");
            return;
        }

        // Calculate commission based on city and sales volume
        if (city.equals("sofia")) {
            if (salesVolume <= 500) {
                commissionRate = 5;
            } else if (salesVolume <= 1000) {
                commissionRate = 7.5;
            } else if (salesVolume <= 10000) {
                commissionRate = 10;
            } else {
                commissionRate = 12;
            }
        } else if (city.equals("varna")) {
            if (salesVolume <= 500) {
                commissionRate = 4.5;
            } else if (salesVolume <= 1000) {
                commissionRate = 8;
            } else if (salesVolume <= 10000) {
                commissionRate = 12;
            } else {
                commissionRate = 13;
            }
        } else if (city.equals("plovdiv")) {
            if (salesVolume <= 500) {
                commissionRate = 5.5;
            } else if (salesVolume <= 1000) {
                commissionRate = 7.5;
            } else if (salesVolume <= 10000) {
                commissionRate = 10;
            } else {
                commissionRate = 14.5;
            }
        } else {
            System.out.println("error");
            return;
        }

        // Calculate the commission fee
        double commission = (commissionRate / 100) * salesVolume;

        // Print the result rounded to two decimal places
        System.out.printf("Commission: %.2f", commission);

        scanner.close();
    }
}

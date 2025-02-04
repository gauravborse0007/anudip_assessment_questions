import java.util.*;
public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input animal name
        System.out.print("Enter the animal name: ");
        String animal = scanner.nextLine().toLowerCase();

        // Check the animal type
        if (animal.equals("dog")) {
            System.out.println("mammal");
        } else if (animal.equals("crocodile") || animal.equals("tortoise") || animal.equals("snake")) {
            System.out.println("reptile");
        } else {
            System.out.println("unknown");
        }

        scanner.close();
    }
}


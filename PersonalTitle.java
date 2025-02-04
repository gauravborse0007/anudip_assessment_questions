
import java.util.Scanner;

public class PersonalTitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the age and gender inputs
        System.out.print("Enter age: ");
        double age = scanner.nextDouble();
        
        System.out.print("Enter gender (m/f): ");
        char gender = scanner.next().charAt(0);

        // Determine and print the personal title
        if (gender == 'm' || gender == 'M') {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender == 'f' || gender == 'F') {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("Invalid gender input.");
        }

        scanner.close();
    }
}


/*
Q1. WAP to accept choice from user and display teh output
1.accept min , max value from the user and display only even number
2. accept a no from the user and check it is prime or not
3.accept a no from the user and check it is palindrom or not
4. accept a no from the user and check it is armstrong 153

Date: 01/02/2025 (Saturday)
*/

import java.util.Scanner;

public class NumberOperations {
    public static void displayEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum value: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum value: ");
        int max = scanner.nextInt();

        System.out.println("Even numbers between " + min + " and " + max + " are:");
        for (int num = min; num <= max; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num < 2) {
            System.out.println(num + " is not a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num, reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
    }

    public static void checkArmstrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num, sum = 0, digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display even numbers in a range");
            System.out.println("2. Check if a number is prime");
            System.out.println("3. Check if a number is a palindrome");
            System.out.println("4. Check if a number is an Armstrong number");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayEvenNumbers();
                    break;
                case 2:
                    checkPrime();
                    break;
                case 3:
                    checkPalindrome();
                    break;
                case 4:
                    checkArmstrong();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

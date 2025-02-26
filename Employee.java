import java.util.Arrays;
import java.util.*;

public class Employee {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM!");
        System.out.print("Enter the number of employees: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        
        String[] empId = new String[size];
        String[] empName = new String[size];
        String[] empDesignation = new String[size];
        long[] empSalary = new long[size];

        while (true) {
            System.out.println("\n1. Add Employee\n2. Update Employee\n3. Search Employee\n4. Display Employees\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee(empId, empName, empDesignation, empSalary, size);
                    break;
                case 2:
                    updateEmployee(empId, empName, empDesignation, empSalary, size);
                    break;
                case 3:
                    searchEmployee(empId, empName, empDesignation, empSalary, size);
                    break;
                case 4:
                    displayEmployee(empId, empName, empDesignation, empSalary, size);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void addEmployee(String[] empId, String[] empName, String[] empDesignation, long[] empSalary, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Employee ID: ");
            empId[i] = sc.next();
            sc.nextLine(); 
            
            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Employee Designation: ");
            empDesignation[i] = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            empSalary[i] = sc.nextLong();
            sc.nextLine(); 

            System.out.println("Employee added successfully!\n");
        }
    }

    public static void updateEmployee(String[] empId, String[] empName, String[] empDesignation, long[] empSalary, int size) {
        System.out.print("Enter Employee ID to update: ");
        String searchId = sc.next();
        sc.nextLine(); 
        
        
        for (int i = 0; i < size; i++) {
            if (empId[i] == searchId) {
                System.out.print("Enter New Name: ");
                empName[i] = sc.nextLine();

                System.out.print("Enter New Designation: ");
                empDesignation[i] = sc.nextLine();

                System.out.print("Enter New Salary: ");
                empSalary[i] = sc.nextLong();
                sc.nextLine(); 

                System.out.println("Employee details updated successfully!");
                break;
            }
        }
        
       
    }

    public static void searchEmployee(String[] empId, String[] empName, String[] empDesignation, long[] empSalary, int size) {
        System.out.print("Enter Employee ID to search: ");
        String searchId = sc.next();
        sc.nextLine(); 
        
        
        for (int i = 0; i < size; i++) {
            if (empId[i] == searchId) {
                System.out.println("\nEmployee Found:");
                System.out.println((i+1)+" "+"Employee ID: " + empId[i]);
                System.out.println("Employee Name: " + empName[i]);
                System.out.println("Designation: " + empDesignation[i]);
                System.out.println("Salary: " + empSalary[i]);
                break;
            }
            
        }
        
        
    }

    public static void displayEmployee(String[] empId, String[] empName, String[] empDesignation, long[] empSalary, int size) {
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < size; i++) {
            System.out.println("Employee ID: " + empId[i]);
            System.out.println("Employee Name: " + empName[i]);
            System.out.println("Designation: " + empDesignation[i]);
            System.out.println("Salary: " + empSalary[i]);
            System.out.println("----------------------");
        }
    }
}
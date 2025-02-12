import java.util.Scanner;

public class onlineFoodOrder {
    public static void main(String[] args) {
        int choice;
        char ans;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my hotel");
        
        do {
            System.out.println("Enter Your choice \n1: Starters\n2:Main Course\n3:Deserts");
			choice=sc.nextInt(); 
            
            switch (choice) {
                case 1:

                    System.out.println("1:Idli       50 Rs.");
                    System.out.println("2:Dosa       70 Rs.");
                    System.out.println("3:Samosa     15 Rs.");
                    System.out.println("4:Poha       30 Rs.");
                    System.out.println("5:Paratha    50 Rs.");
                    
                    break;
                
                case 2:
                    System.out.println("1:Dal Tadka       120 Rs.");
                    System.out.println("2:Dal Makhni       150 Rs.");
                    System.out.println("3:Paneer     200 Rs.");
                    System.out.println("4:Rajma       170 Rs.");
                    System.out.println("5:Aloo    130 Rs.");
          
                    break;

                case 3:
                    System.out.println("1:Gulab Jamun       30 Rs.");
                    System.out.println("2:Rasgulla       40 Rs.");
                    System.out.println("3:Jalebi     40 Rs.");
                    System.out.println("4:Rabdi       70 Rs.");
                    System.out.println("5:Halva    50 Rs.");
                
                    break;
            }
            System.out.println("Do you want to add any other item :Y/N");
			ans=sc.next().charAt(0);
        }

        while(ans=='Y' || ans=='y');
         
        if(ans == 'N'|| ans=='n'){
            System.out.println("your bill: xyz. RS");
        }
    }
}

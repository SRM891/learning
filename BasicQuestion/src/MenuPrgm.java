import java.util.Scanner;

public class MenuPrgm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (option) {
                case 1:
                    double sum = num1 + num2;
                    System.out.println("Sum: " + sum);
                    break;
                case 2:
                    double difference = num1 - num2;
                    System.out.println("Difference: " + difference);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}

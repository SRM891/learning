import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your age (1-120): ");
        int age = scanner.nextInt();

        double interestRate = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.2;
            } else if (age >= 59 && age <= 120) {
                interestRate = 7.6;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 60) {
                interestRate = 9.2;
            } else if (age >= 61 && age <= 120) {
                interestRate = 8.3;
            }
        } else {
            System.out.println("Invalid gender. Please enter 'Male' or 'Female'.");
            return;
        }

        if (interestRate != 0.0) {
            System.out.println("Interest Rate: " + interestRate + "%");
        } else {
            System.out.println("No interest rate found for the given gender and age.");
        }

        scanner.close();
    }
}

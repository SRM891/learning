import java.util.Scanner;

public class ColorDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the color code (R, B, G, O, Y, W): ");
        char colorCode = scanner.next().charAt(0);

        String colorName = switch (colorCode) {
            case 'R' -> "Red";
            case 'B' -> "Blue";
            case 'G' -> "Green";
            case 'O' -> "Orange";
            case 'Y' -> "Yellow";
            case 'W' -> "White";
            default -> "Invalid Code";
        };

        System.out.println("Color Name: " + colorName);

        scanner.close();
    }
}


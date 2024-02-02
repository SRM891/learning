import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Integer:");
        int n = sc.nextInt();
        if(n<0) System.out.println("Negative");
        else if(n>0) System.out.println("Positive");
        else System.out.println("Zero");
    }
}
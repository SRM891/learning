import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        StringBuilder sum = new StringBuilder();
        while(n>9){
            sum.append(n % 10);
            n/=10;
        }
        sum.append(n);
        System.out.println(sum);
    }
}

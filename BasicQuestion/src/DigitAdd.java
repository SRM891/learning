import java.util.Scanner;

public class DigitAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>9){
            sum += n%10;
            n/=10;
        }
        sum+=n;
        System.out.println(sum);
    }
}

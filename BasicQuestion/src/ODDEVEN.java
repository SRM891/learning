import java.util.Scanner;

public class ODDEVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Integer");
        int n = sc.nextInt();
        String res = n%2==0?"Even":"Odd";
        System.out.println(res);
    }
}

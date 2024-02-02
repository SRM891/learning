import java.util.Scanner;

public class AlphabeticOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Character: ");
        String first = sc.next();
        while(first.length()!=1){
            System.out.println("Enter only single character");
            first = sc.next();
        }
        System.out.println("Enter Second character: ");
        String Second = sc.next();
        while(Second.length()!=1){
            System.out.println("Enter only single character");
            Second = sc.next();
        }

        String res = first.charAt(0)<Second.charAt(0)?first+", "+Second: Second+", "+first;
        System.out.println(res);
    }
}

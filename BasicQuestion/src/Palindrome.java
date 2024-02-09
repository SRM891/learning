import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int start = 0;
        int end = s.length()-1;
        while(end>start){
            if(s.charAt(start)!=s.charAt(end)){
                System.out.println("Not a palindrome");
                return;
            }else{
                start++;
                end--;
            }
        }
        System.out.println("It's a palindrome");
    }
}

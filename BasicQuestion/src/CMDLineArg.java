import java.util.Scanner;

public class CMDLineArg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here:");
        String S = sc.nextLine();
        if(S.isEmpty()){
            System.out.println("No Value");
        }else{
            String[] s = S.split(" ");
            for(int i=0; i<s.length-1; i++){
                System.out.print(s[i]+", ");
            }
            System.out.print(s[s.length-1]);
        }
    }
}

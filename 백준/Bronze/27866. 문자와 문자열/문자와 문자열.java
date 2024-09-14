import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        String S = sc.nextLine();
        int i = sc.nextInt();
        
        char charAt = S.charAt(i-1);
        System.out.println(charAt);
    }
}

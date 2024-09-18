import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        StringBuilder sb = new StringBuilder();

        String a = sc.nextLine();
        
        for(char c='a'; c<='z';c++){
            sb.append(a.indexOf(c) + " ");
        }
        System.out.println(sb);
        
    }
}

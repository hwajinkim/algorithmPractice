import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String T = sc.nextLine();
        StringTokenizer tokens = new StringTokenizer(T, " ");
        ArrayList<String> list = new ArrayList<String>();

        while(tokens.hasMoreTokens()){
            String token = tokens.nextToken();
            list.add(token);
        }
        System.out.println(list.size());
    }
}

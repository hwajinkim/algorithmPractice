import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        List<String> list = new ArrayList<String>();
        
        while (st.hasMoreTokens()) {
            String a = st.nextToken();
            list.add(a);
        }

        int max=-9999;
        for(int i=0; i<list.size(); i++){
            StringBuffer sb = new StringBuffer(list.get(i));
            String reverse_str = sb.reverse().toString();
            int reverse_int = Integer.parseInt(reverse_str);
            if(reverse_int > max){
                max = reverse_int;
            }
        }
        System.out.println(max);
        
    }
}

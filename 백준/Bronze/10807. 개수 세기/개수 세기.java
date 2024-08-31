import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] number = new int[N];
        for(int i=0;i<N;i++) {   //수 입력받기
            number[i]=sc.nextInt();
        }
        int v = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i <number.length; i++){
            if(number[i] == v)
            cnt ++;
        }
        System.out.println(cnt);
    }
}

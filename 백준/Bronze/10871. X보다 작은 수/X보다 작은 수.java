import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] number = new int[N];
        for(int i=0;i<N;i++) {   //수 입력받기
            number[i]=sc.nextInt();
        }
        
        for(int i=0;i<N;i++){
            if (number[i]<X)System.out.print(number[i]+" ");
        }
    }
}

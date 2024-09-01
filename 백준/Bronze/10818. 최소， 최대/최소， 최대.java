import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] number = new int[N];

        int min = 1000000;
        int max = -1000000;

        for(int i=0;i<N;i++) {   //수 입력받기
            number[i]=sc.nextInt();
            if(number[i]<min){
                min = number[i];
            }
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.print(min+" "+max);
    }
}

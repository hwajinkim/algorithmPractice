
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }

        for(int k=0; k<M; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int dump = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = dump;
        }

        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}

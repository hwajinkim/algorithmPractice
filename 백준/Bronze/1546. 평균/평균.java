import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);        
       
        for(int i=0; i<n; i++){
            sum += (arr[i]/arr[arr.length-1])*100;
        }
        System.out.print(sum/arr.length);
    }
}

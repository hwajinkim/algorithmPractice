
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int k=0; k<n;k++){
            arr[k] = k+1;
        }
        
        for(int k=0; k<m; k++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            while(i<j){
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
   
        for(int a : arr){
             System.out.print(a+" ");
        }
    }
}

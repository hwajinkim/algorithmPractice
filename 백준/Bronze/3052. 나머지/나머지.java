
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int arr[] = new int[10];
        
        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            int remain = n%42;
            arr[i] = remain;
        }
   
        HashSet<Integer> unique = new HashSet<>();

        for(int a : arr){
            unique.add(a);
        }
        System.out.println(unique.size());

        
    }
}

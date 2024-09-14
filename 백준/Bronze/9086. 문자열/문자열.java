import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int T = sc.nextInt();
        String [] arr = new String[T];
        for(int i=0; i<T; i++){
            arr[i] = sc.next();
        }
        for(int i=0; i<T; i++){
            String a = arr[i];
            
            if(a.length()>0){
                String first = String.valueOf(a.charAt(0));
                String last = String.valueOf(a.charAt(a.length()-1));
                String str = "";
                str = first.concat(last);
                arr[i] = str;
            }   
        }
        for(String a : arr){
            System.out.println(a);
        }
    }
}

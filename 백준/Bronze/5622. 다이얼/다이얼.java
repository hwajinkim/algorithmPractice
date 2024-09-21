import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String[] arr = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ",""};
        String a = sc.nextLine();

        int answer=0;
        int sum=0;
        for(int j=0; j<arr.length; j++){
            for(int i=0; i<a.length(); i++){
                String ca = Character.toString(a.charAt(i));
                if(arr[j].contains((ca))){
                    answer = j+2;
                    sum+=answer;       
                }   
            }
        }
        System.out.println(sum);
    }
}

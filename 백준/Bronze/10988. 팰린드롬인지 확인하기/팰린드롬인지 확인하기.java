import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		int result=1;
		int[] arr = new int[str.length()];
		for(int i=0; i<str.length();i++){
			if(str.charAt(i) == str.charAt(str.length()-1-i)){
				
				arr[i] += 1;
			}else{
				
				arr[i] += 0;
			}
		}
		
		for(int a : arr){
			if(a == 0){
				result = 0;
			}
		}
		System.out.println(result);
    }
}

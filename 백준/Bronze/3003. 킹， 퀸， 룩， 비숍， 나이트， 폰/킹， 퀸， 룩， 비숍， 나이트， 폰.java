import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 1, 2, 2, 2, 8};

		for(int i=0; i<arr.length; i++){
			int a = sc.nextInt();
			if(arr[i] > a){
				a = arr[i] - a;
			}else if(arr[i] < a){
				a = arr[i] - a;
			}else{
				a = 0;
			}
			System.out.print(a +" ");
		}

    }
}

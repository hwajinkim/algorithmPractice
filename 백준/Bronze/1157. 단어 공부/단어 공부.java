import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		//1. 문자열 입력 받음
		//2. 문자열 크기의 정수 배열을 생성
		//3. 문자열이 겹칠 때 마다 배열에 숫자 count
		//4. 배열에서 가장 큰값이 들어있는 인덱스 값으로 문자 찾음.
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		sc.close();
		
		int[] cnt = new int[26];

		for(int i=0; i < str.length();i++){
			int num = str.charAt(i)-'A';
			cnt[num]++;
		}

		int max=-9999;
		char answer='?';

		for(int i=0; i<cnt.length; i++){
			if(cnt[i]> max){
				max = cnt[i];
				answer = (char) (i+'A');
			} else if(max == cnt[i]){
				answer='?';
			}
		}
		System.out.println(answer);
	}
}

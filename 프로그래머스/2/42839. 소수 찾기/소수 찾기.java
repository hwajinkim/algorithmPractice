import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet(); //중복값 제거를 위해 set 선언
    char[] arr; //종이조각
    boolean[] visited; //사용여부
    
    public int solution(String numbers) {
        int answer = 0;
        arr = new char[numbers.length()];
        visited = new boolean[numbers.length()];
        
        for(int i=0; i<numbers.length(); i++){
            arr[i] = numbers.charAt(i);
        }
        dfs("",0);
        answer = set.size();
        return answer;
    }
    
    public void dfs(String str, int depth){
        int num;
        if(str != ""){
            num = Integer.parseInt(str);
            if(isPrime(num)) set.add(num);    
        }
        if(depth == arr.length) return;
        
        for(int i=0; i<arr.length; i++){
            // 이미 방문했으면 건너뛰기
            if(visited[i]) continue;
            visited[i] = true;
            dfs(str+arr[i], depth+1);
            visited[i] = false;
        }
        
    }
    
    public boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}
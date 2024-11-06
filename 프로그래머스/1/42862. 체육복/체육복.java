import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 최소 수업들을 수 있는 학생 수
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복 가진 학생이 도난 당했을 때
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        
        // 도난 당한 학생에게 빌려줄 때
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    answer++;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
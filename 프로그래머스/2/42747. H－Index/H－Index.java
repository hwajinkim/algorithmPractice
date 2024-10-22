import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        //1. citations 배열 오름차순 정렬
        Arrays.sort(citations);
        
        //2. citations 배열 크기만큼 돌면서 인용된 논문수를 줄여가며 인용 횟수와 비교 
        //2-1. 인용 횟수가 인용된 논문수보다 크거나 같으면 -> h, answer에 담고 반복문 탈출
        for(int i=0; i<citations.length; i++){
            int h = citations.length -i;
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}
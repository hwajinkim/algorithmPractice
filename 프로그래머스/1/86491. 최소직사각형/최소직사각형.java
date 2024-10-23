import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        //1. sizes의 크기만큼 반복
        //1-1. sizes의 가로와 세로를 비교해서 큰 값과 작은 값을 각각 저장.
        //1-2. 각각 가로, 세로를 저장한 값과 최종 가로, 세로 최댓 값과 비교해서 큰 값 최종 가로, 세로 최댓 값에 저장
        //2. 최종 가로, 세로 최댓 값을 곱해서 answer에 저장 후 리턴
        int max_w=0;
        int max_h=0;
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }
        answer = max_w * max_h;
        return answer;
    }
}
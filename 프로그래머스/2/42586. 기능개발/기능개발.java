import java.util.*;
class Solution {
    public List solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        // 작업 일수 저장할 배열
        int[] works = new int[progresses.length];
        
        // 배포마다 기능 갯수 저장할 리스트
        List<Integer> list = new ArrayList<>();
        
        // 1. 작업 일수 배열 구하기
        for(int i=0; i<progresses.length; i++){
            int remain_work = 100 - progresses[i];
            int complete_time = remain_work / speeds[i];
            int add_time = remain_work % speeds[i];
            if(add_time != 0){
                complete_time++;
            }
            works[i] = complete_time;
        }
        
        // 2. works for문 돌린다.
        int x = works[0];
        int count = 1;
        for(int i=1; i<works.length; i++){
            if(x >= works[i]){
                count+=1;
            }else{
                list.add(count);
                count = 1;
                x = works[i];
            }
        }
        list.add(count);
        
        System.out.print(list+" ");
        
        
        return list;
    }
}
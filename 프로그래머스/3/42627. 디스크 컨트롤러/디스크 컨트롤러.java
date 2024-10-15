import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        // jobs 배열의 요청시간 오름차순
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        // jobs 배열의 소요시간 오름차순 -> 우선순위 큐 선언(자동 오름차순 정렬)
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        int index=0; //현재 배열 위치
        int end=0; //끝 요소
        int total=0; // 총 소요시간
        int count=0; // 진행한 작업 수 카운트 
        
        while(count < jobs.length){
            
            // 지금까지 걸린 작업시간(end) 안에 들어오는 요청시간이 포함된 배열만 pq에 담음.
            while(index < jobs.length && jobs[index][0] <= end){
                pq.add(jobs[index++]);
            }
            
            // 우선순위 큐가 비어 있으면, end값에 요청 시간 새로 추가
            if(pq.isEmpty()){
               end =  jobs[index][0];
            } else { // 비어 있지 않으면 우선순위 큐를 뽑아서 총 걸린시간, end 값 업데이트
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0]; // 소요시간 + 지금까지 걸린 시간 - 요청시간
                end += cur[1];
                count++;
            }
        }
        return total / jobs.length;
    }
}
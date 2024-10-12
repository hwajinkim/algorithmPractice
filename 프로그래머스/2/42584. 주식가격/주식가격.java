class Solution {
    public int[] solution(int[] prices) {
        
        //1. 주가 배열 크기로 답 배열 만듦.
        //2. 0부터 주가 배열 크기만큼 배열 반복 -> 현재 가격
        //2-1. cnt(가격 안 떨어지는 기간 초) 0으로 초기화
        //3. i+1부터 주가 배열 크기만큼 배열 반복 -> 비교 가격 
        //3-1. cnt 1씩 증가
        //3-2. 현재 가격이 비교 가격보다 크면 반복문 빠져 나옴.
        //4. 답 배열의 현재가격 위치에 cnt 담음.
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++){
            int cnt = 0;
            for(int j=i+1; j<prices.length; j++){
                cnt++;
                if(prices[i] > prices[j]) break;
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}
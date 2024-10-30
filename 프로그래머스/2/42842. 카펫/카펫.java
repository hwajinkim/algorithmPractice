class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 전체 면적
        int S = brown+yellow;
        // 세로 크기로 반복
        //노란색 격자수는 1이상, 세로는 3이상 -> i=3부터 시작
        for(int i=3; i<S; i++){
            // 가로 = 면적 / 세로
            int width = S/i;
            // 가로는 세로보다 커야 함.
            if(width >= i){
                // 노란색 격자가 가로-2 * 세로-2 한 값 같으면 
                // 이때의 가로와 세로값 배열에 담음.
                if(yellow == (width-2) * (i-2)){
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}
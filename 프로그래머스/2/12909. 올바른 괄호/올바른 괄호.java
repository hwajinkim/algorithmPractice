import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        int openCnt = 0;
        int closeCnt = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') openCnt++;
            else closeCnt++;
            if(openCnt < closeCnt){
                answer = false;
                return answer;
            }
        }
        if(openCnt == closeCnt){
            answer = true;
            return answer;
        }
        return answer;
    }
}
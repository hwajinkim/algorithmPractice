class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
       
        int index1 = 0;
        int index2 = 0;
        
        for(int i=0; i<goal.length; i++){
            if(cards1[index1].equals(goal[i])){
                index1 = (index1 < cards1.length-1)? index1 + 1 : index1;
            } else if(cards2[index2].equals(goal[i])){
                index2 = (index2 < cards2.length-1)? index2 + 1 : index2;
            } else {
                return "No"; 
            }
        }
        
        return "Yes";
    }
}
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int[] sum_arr = new int[photo.length];
        int sum=0;
      
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(map.get(photo[i][j]) != null){
                    sum+=map.get(photo[i][j]);    
                }
            }
            sum_arr[i] = sum;
            sum =0;
        }
        
        
        return sum_arr;
    }
}
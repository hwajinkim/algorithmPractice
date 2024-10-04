import java.util.*;

public class Solution {
    public List solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}
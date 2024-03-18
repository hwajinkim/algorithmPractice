import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        HashMap<String, Integer> type = new HashMap<String, Integer>();
        type.put("code",0);
        type.put("date",1);
        type.put("maximum",2);
        type.put("remain",3);
        
        List<int []> ext_data = new ArrayList<>();
        
        for(int[] d : data){
            if(d[type.get(ext)] < val_ext){
                ext_data.add(d);
            }
        }
        
        ext_data.sort(Comparator.comparingInt(arr -> arr[type.get(sort_by)]));
        
        return ext_data.toArray(new int[0][]);
    }
}
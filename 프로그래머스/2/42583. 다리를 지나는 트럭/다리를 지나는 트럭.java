import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        //다리큐
        Queue<int[]> bridge = new LinkedList<>();
        //트럭큐
        Queue<Integer> trucks = new LinkedList<>();
        
        // 트럭을 뽑아 트럭큐에 담음.
        for(int target : truck_weights){
            trucks.add(target);
        }
        
        int time=0;
        int cur_weight=0;
        
        //다리큐가 비어있지 않거나, 트럭큐가 비어있지 않을 때까지 
        while(!bridge.isEmpty() || !trucks.isEmpty()){
            //1. 다리큐에서 트럭뺌
            //1-1. 다리큐 비어있지 않고, 
            //1-2. 다리큐 첫 배열의 첫 요소 값(다리 건널 때 소요시간)이 경과시간보다 작거나 같을때 
            if(!bridge.isEmpty() && bridge.peek()[0] <= time){
                //다리큐에서 트럭빼서 temp 배열에 담음
                int [] temp = bridge.poll();
                //현재 무게에서 트럭 무게 뺌
                //temp[0]: 다리 건널 때 소요시간, temp[1]: 트럭 무게
                cur_weight -= temp[1];
            }
            
            //2. 다리큐에 트럭 넣음.
            //2-1. 트럭큐가 비어있지 않고, 
            //2-2. 다리큐 크기+1이 다리 갯수보다 작거나 같고,
            //2-3. 현재무게+트럭무게가 다리가 견딜 수 있는 무게보다 작거나 같을 때
            if(!trucks.isEmpty() && bridge.size()+1 <= bridge_length && 
               cur_weight + trucks.peek() <= weight){
                //트럭큐에서 트럭 뺌
                int temp = trucks.poll();
                //뺀 트럭을 현재무게에 담음.
                cur_weight += temp;
                //다리큐에 트럭추가(경과시간+다리 갯수, 트럭(트럭무게))
                bridge.add(new int[]{time+bridge_length, temp});
            }
            time++;
        }
        return time;
    }
}
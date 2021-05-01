import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution1743 {
    public int[] restoreArray(int[][] adjacentPairs) {
        int[] res=new int[adjacentPairs.length+1];
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int[] pairs:adjacentPairs){
            int num1 = pairs[0], num2 = pairs[1];
            map.computeIfAbsent(num1, k -> new ArrayList<>()).add(num2);
            map.computeIfAbsent(num2, k -> new ArrayList<>()).add(num1);
        }
        for(int key:map.keySet()){
            if(map.get(key).size()==1){
                res[0]=key;
                break;
            }
        }

        for(int i=1;i< res.length;i++){
            List<Integer> list=map.get(res[i-1]);
            for(int m:list){
                if(map.containsKey(m)){
                    res[i]=m;
                    break;
                }
            }
            map.remove(res[i-1]);
        }
        return res;
    }


}

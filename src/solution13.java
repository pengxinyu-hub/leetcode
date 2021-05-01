import java.util.HashMap;
import java.util.Map;

public class solution13 {
    public int romanToInt(String s) {
        int[] a =     {1,  5,  10, 50, 100, 500, 1000};
        char[] b = {'I','V','X','L', 'C', 'D',  'M'};
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(b[i],a[i]);
        }
        char[] chars=s.toCharArray();
        int sum=0;
        for(int i=0;i<chars.length-1;i++){
            if(map.get(chars[i])<map.get(chars[i+1]))
                sum-=map.get(chars[i]);
            else  sum+=map.get(chars[i]);
        }
        sum+=map.get(chars[chars.length-1]);
        return sum;
    }
}

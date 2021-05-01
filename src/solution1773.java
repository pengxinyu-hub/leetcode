import java.util.List;

public class solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=-1;
        if(ruleKey.equals("type"))  a=0;
        else if(ruleKey.equals("color"))  a=1;
        else if(ruleKey.equals("name"))  a=2;
        int sum=0;
        for(List<String> list: items){
            if(list.get(a).equals(ruleValue))
                sum++;
        }
        return sum;
    }
}

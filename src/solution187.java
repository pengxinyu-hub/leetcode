import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        if(s.length()<=10)  return list;
        for(int i=0;i<=s.length()-10;i++){
            list.add(s.substring(i,i+10));
        }
        list.sort(String::compareTo);
        for (int i=list.size()-1;i>0;i--){
            if(!list.get(i).equals(list.get(i-1))){
                list.remove(i);
            }
        }
        list.remove(0);
        list=list.stream().distinct().collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new solution187().findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }
}

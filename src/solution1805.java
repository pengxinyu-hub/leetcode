import java.util.HashSet;
import java.util.Set;

public class solution1805 {
    public int numDifferentIntegers(String word) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isDigit(c)){
                String cur=String.valueOf(c);
                while (i+1<word.length()&&Character.isDigit(word.charAt(i+1))){
                    if(cur.equals("0")){
                        cur="";
                    }
                    cur+=word.charAt(i+1);
                    i++;
                }
                set.add(cur);
            }
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new solution1805().numDifferentIntegers("035985750011523523129774573439111590559325a1554234973"));
    }
}

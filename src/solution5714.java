import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution5714 {

    public  List<String> extractMessageByRegular(String str){
        ArrayList<String> word=new ArrayList<String>();
        int m=0,n=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                if(count==0){
                    m=i;
                }
                count++;
            }
            if(str.charAt(i)==')'){
                count--;
                if(count==0){
                    n=i;
                    word.add(str.substring(m+1,n));
                }
            }
        }
        return word;
    }


    public static void main(String[] args) {
        System.out.println(new solution5714().extractMessageByRegular("(name)is(age)yearsold"));
    }

}

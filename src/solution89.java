import java.util.ArrayList;
import java.util.List;

public class solution89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>((int) Math.pow(2,n));
        ans.add(0);
        int i=1;
        while (i<Math.pow(2,n)){
            for(int j=i;j<2*i;j++){
                ans.add(ans.get(2*i-1-j)+i);
            }
            i=2*i;
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a=grayCode(1);
        System.out.println(a);
    }
}

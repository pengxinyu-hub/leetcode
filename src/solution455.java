import java.util.Arrays;

public class solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int point=0;
        for(int i=0;i<g.length;i++){
            for(int j=point;j<s.length;j++){
                if(g[i]<=s[j]){
                    count++;
                    point=j;
                    point++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g={1,2};
        int[] s={1,2,3};
        System.out.println(new solution455().findContentChildren(g,s));
    }
}

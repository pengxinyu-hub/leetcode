import java.util.Arrays;

public class solution135 {
    public int candy(int[] ratings) {
        int[] candy=new int[ratings.length];
        Arrays.fill(candy,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]&&candy[i]<=candy[i-1])
                candy[i]=candy[i-1]+1;
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&candy[i]<=candy[i+1]){
                candy[i]=candy[i+1]+1;
            }
        }
        int ans=0;
        for(int i:candy){
            ans+=i;
        }
        return ans;
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class solution452 {
    public int findMinArrowShots(int[][] points) {
        boolean[] marked=new boolean[points.length];
        int count=0;
        Arrays.sort(points,(a,b)->(Integer.compare(a[1],b[1])));
        for(int i=0;i<points.length;i++){
            if(marked[i]) continue;
            marked[i]=true;
            int m=points[i][1];
            for(int j=i;j< points.length;j++){
                if(m>= points[j][0]){
                    marked[j]=true;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] p={{1,2}};
        System.out.println(new solution452().findMinArrowShots(p));
    }
}

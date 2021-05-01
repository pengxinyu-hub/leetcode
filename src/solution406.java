import java.util.Arrays;
import java.util.Comparator;

public class solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0])  return o2[1]-o1[1];
                return o1[0]-o2[0];
            }
        });
        int[][] res=new int[people.length][2];
        boolean[] marked=new boolean[people.length];
        for(int i=0;i<people.length;i++){
            int k=people[i][1];
            for(int j=0;j<=k;j++){
                if(marked[j])
                    k++;
            }
            marked[k]=true;
            res[k]=people[i];
            System.out.println(k);
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] a={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] r=new solution406().reconstructQueue(a);
        for(int i=0;i<r.length;i++){
            for (int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

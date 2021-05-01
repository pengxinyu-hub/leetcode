public class solution5702 {
    public int findCenter(int[][] edges) {
        int[] a=edges[0];
        int[] b=edges[1];
        for(int i=0;i<2;i++){
            if(b[i]==a[0])
                return a[0];
            else if(b[i]==a[1])
                return a[1];
        }
        return a[0];
    }
}

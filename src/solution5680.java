public class solution5680 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans=-1;
        int nearest=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            if((points[i][0]==x||points[i][1]==y)&&Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y)<nearest){
                ans=i;
                nearest=Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
            }
        }
        return ans;
    }
}

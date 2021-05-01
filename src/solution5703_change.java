public class solution5703_change {
    private double maxAve=0.0;
    public double maxAverageRatio(int[][] classes, int extraStudents){
        dfs(classes,0,extraStudents);
        return maxAve;
    }

    private void dfs(int[][] classes,int s,int limit){
        if(s==limit) {
            if(maxAve<ave(classes))
                maxAve = ave(classes);
            return;
        }
        for(int i=0;i<classes.length;i++){
            classes[i][0]=classes[i][0]+1;
            classes[i][1]=classes[i][1]+1;
            dfs(classes,s+1,limit);
            classes[i][0]=classes[i][0]-1;
            classes[i][1]=classes[i][1]-1;
        }
    }


    private double ave(int[][] classes){
        double totalPass=0.0;
        for(int j=0;j<classes.length;j++){
            totalPass+=(double) classes[j][0]/classes[j][1];
        }
        return totalPass/classes.length;
    }

    public static void main(String[] args) {
        int[][] classes={{2,4},{3,9},{4,5},{2,10}};
        System.out.println(new solution5703_change().maxAverageRatio(classes,4));
    }
}

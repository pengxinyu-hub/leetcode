public class solution5703 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        for(int i=0;i<extraStudents;i++){
            double maxDiff=0.0;
            int ans=0;
            for(int j=0;j<classes.length;j++){
                int pass=classes[j][0];
                int total=classes[j][1];
                int afterPass=classes[j][0]+1;
                int afterTotal=classes[j][1]+1;
                if(((double)afterPass/afterTotal-(double) pass/total)>maxDiff) {
                    maxDiff = (double) afterPass / afterTotal- (double) pass / total;
                    ans=j;
                }
            }
            System.out.println(maxDiff);
            classes[ans][0]=classes[ans][0]+1;
            classes[ans][1]=classes[ans][1]+1;
        }
        double totalPass=0.0;
        for(int j=0;j<classes.length;j++){
            totalPass+=(double) classes[j][0]/classes[j][1];
        }
        return totalPass/classes.length;
    }

    public static void main(String[] args) {
        int[][] classes={{2,4},{3,9},{4,5},{2,10}};
        System.out.println(new solution5703().maxAverageRatio(classes,4));
        for(int i=0;i<classes.length;i++){
            System.out.println(classes[i][0]+" "+classes[i][1]);
        }
    }
}

public class solution498_unsolved {
    public int[] findDiagonalOrder(int[][] matrix) {
        int size= matrix.length*matrix[0].length;
        int[] res=new int[size];
        int k=0;
        for(int j=0;j<=matrix.length+matrix[0].length-2;j++){
            for(int i=Math.min(j,matrix[0].length-1);i>=0&&j-i<matrix.length;i--){
                res[k++]=matrix[j-i][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] m={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] a=new solution498_unsolved().findDiagonalOrder(m);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}

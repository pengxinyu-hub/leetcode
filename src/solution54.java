import java.util.LinkedList;
import java.util.List;

public class solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new LinkedList<>();
        int l = 0;    //左边界
        int r = matrix[0].length - 1;  //右边界
        int u = 0;   //上边界
        int d = matrix.length - 1;  //下边界
        List<Integer> list = new LinkedList<>();
        while (l <= r && u <= d){
            //向右扫
            for (int i = l; i <= r; i++) {
                list.add(matrix[u][i]);
            }
            u++;
            //向下扫
            for (int i = u; i <= d; i++) {
                list.add(matrix[i][r]);
            }
            r--;
            //向左扫
            for (int i = r; i >= l && u <= d; i--) {
                list.add(matrix[d][i]);
            }
            d--;
            //向上扫
            for (int i = d; i >= u && l <= r; i--) {
                list.add(matrix[i][l]);
            }
            l++;
        }
        return list;
    }
}

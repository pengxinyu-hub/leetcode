
import java.util.Arrays;
import java.util.List;

public class solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=1;i<triangle.size();i++){
            triangle.get(i).set(0,triangle.get(i-1).get(0)+triangle.get(i).get(0));
            triangle.get(i).set(triangle.get(i).size()-1,triangle.get(i-1).get(triangle.get(i-1).size()-1)+triangle.get(i).get(triangle.get(i).size()-1));
        }
        for(int i=1;i<triangle.size();i++){
            for(int j=1;j<triangle.get(i).size()-1;j++){
                triangle.get(i).set(j,
                        Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j))+triangle.get(i).get(j));
            }
        }
        return triangle.get(triangle.size()-1).stream().min((s1, s2) -> s1 - s2).get();
    }

    public static void main(String[] args) {
        List<List<Integer>> t= Arrays.asList(Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,3));
        System.out.println(new solution120().minimumTotal(t));
        System.out.println(t);
    }
}

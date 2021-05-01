import java.util.*;

public class solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Arrays.asList(0);
        List<Integer>[] map = new List[n];
        Queue<Integer> queue= new LinkedList<>();
        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
        }
        for (int[] a : edges) {
            map[a[0]].add(a[1]);
            map[a[1]].add(a[0]);
        }
        for (int i = 0; i < n; i++) {
            if (map[i].size() == 1) queue.add(i);
        }
        while (n > 2) {
            int size = queue.size();
            n -= size;
            while (size-- > 0) {
                int s = queue.remove();
                for (int i : map[s]) {
                    map[i].remove((Object)s);
                    if(map[i].size()==1) {
                        queue.add(i);
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty())
            res.add(queue.remove());
        return res;
    }


    public static void main(String[] args) {
        int[][] edges={{1,0},{1,2},{1,3}};
        System.out.println(new solution310().findMinHeightTrees(4,edges));
    }
}

import java.util.ArrayDeque;
import java.util.Deque;

public class solution994_better {
    public int orangesRotting(int[][] grid) {
        int[] p1 = {1, -1, 0, 0}, p2 = {0, 0, 1, -1};
        Deque<int[]> queue = new ArrayDeque<>();
        //æèççðå å¥éåä¸­ï¼ä½ä¸ºå¼å§æ©æ£çèµ·ç¹
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        //ä»èççðå¼å§ææï¼å¶å®å°±æ¯ä¸ä¸ªbfsæ±æ æå¾æç­è·¯çé®é¢
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] temp = queue.poll();
                for (int j = 0; j < p1.length; j++) {
                    int x = temp[0] + p1[j], y = temp[1] + p2[j];
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        queue.offer(new int[] {x, y});
                    }
                }
            }
            if (!queue.isEmpty()) {
                steps++;
            }
        }

        //éåç©éµï¼å¤æ­æ¯å¦æðè¿æªè¢«ææï¼ä¹å°±æ¯æ¯å¦è¿ægrid[i][j] = 1çå°å¿
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return steps;
    }
}

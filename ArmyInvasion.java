import java.util.*;

public class ArmyInvasion {

    public static void main(String[] args) {
        List<String> Q1 = Arrays.asList("AE", "EE");
        System.out.println(invasionTime(2, 2, Q1)); // Output: 2
        
        List<String> Q2 = Arrays.asList("AE", "**", "EE");
        System.out.println(invasionTime(3, 2, Q2)); // Output: 2
    }

    public static int invasionTime(int N, int M, List<String> Q) {
        char[][] grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            grid[i] = Q.get(i).toCharArray();
        }
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        int enemyCells = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'A') {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 'E') {
                    enemyCells++;
                }
            }
        }
        if (enemyCells == 0) return 0;
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            time++;  
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0], y = current[1];

                for (int[] direction : directions) {
                    int newX = x + direction[0], newY = y + direction[1];

                    if (newX >= 0 && newX < N && newY >= 0 && newY < M && grid[newX][newY] == 'E') {
                        grid[newX][newY] = 'A';
                        queue.offer(new int[]{newX, newY});
                        enemyCells--;
                        if (enemyCells == 0) return time;
                    }
                }
            }
        }
        return -1;
    }
}

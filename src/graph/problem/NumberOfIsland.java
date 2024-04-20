package graph.problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PairCustom {
    int i, j;

    public PairCustom(int i, int j) {
        this.i = i;
        this.j = j;
    }
}


public class NumberOfIsland {

    public static void bfs(int row, int col, int[][] adj) {
        Queue<PairCustom> queue = new LinkedList<>();
        queue.add(new PairCustom(row, col));
        visited[row][col] = true;
        int nrow[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        int ncol[] = {0, 1, 1, 1, 0, -1, -1, -1};
        int n = adj.length;
        int m = adj[0].length;
        while (!queue.isEmpty()) {
            PairCustom pairCustom = queue.poll();
            int p = pairCustom.i;
            int q = pairCustom.j;
            for (int k = 0; k < 8; k++) {
                int r = p + nrow[k];
                int c = q + ncol[k];
                if (r >= 0 && r < n && c >= 0 && c < m && adj[r][c] == 1 && !visited[r][c]) {
                    queue.add(new PairCustom(r, c));
                    visited[r][c] = true;
                }
            }
        }
    }

    static boolean visited[][] = new boolean[10][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int adj[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }
        int isLandCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (adj[i][j] != 0 && !visited[i][j]) {
                    isLandCount++;
                    bfs(i, j, adj);
                }
            }
        }
        System.out.println(isLandCount);
    }
}

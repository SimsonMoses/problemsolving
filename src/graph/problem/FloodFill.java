package graph.problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class FloodPair {
    int r, c;

    FloodPair(int i, int j) {
        r = i;
        c = j;
    }
}

public class FloodFill {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int adj[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }
        Queue<FloodPair> queue = new LinkedList<>();
        boolean visited[][] = new boolean[n][m];
        int sr, sc, newColor;
        sr = scanner.nextInt();
        sc = scanner.nextInt();
        newColor = scanner.nextInt();
        int sourcecolor = adj[sr][sc];
        adj[sr][sc] = newColor;
        queue.add(new FloodPair(sr, sc));
        visited[sr][sc] = true;
        int row[] = {-1, 0, 1, 0};
        int col[] = {0, 1, 0, -1};
        while (!queue.isEmpty()) {
            FloodPair p = queue.poll();
            int r = p.r;
            int c = p.c;

            for (int i = 0; i < 4; i++) {
                int nrow = r + row[i];
                int ncol = c + col[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol] && adj[nrow][ncol] != 0 && adj[nrow][ncol] == sourcecolor) {
                    queue.add(new FloodPair(nrow, ncol));
                    visited[nrow][ncol] = true;
                    adj[nrow][ncol] = newColor;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//https://www.geeksforgeeks.org/flood-fill-algorithm/
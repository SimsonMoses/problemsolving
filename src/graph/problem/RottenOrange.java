package graph.problem;

import java.util.LinkedList;
import java.util.Queue;

class CustomQueueObject {
    int x, y, t;

    public CustomQueueObject(int i, int j, int t) {
        this.x = i;
        this.y = j;
        this.t = t;
    }
}

public class RottenOrange {
    public static void main(String[] args) {
        int adj[][] = {{0, 1, 2}, {0, 1, 1}, {2, 1, 1}};
        int n = adj.length;
        int m = adj[0].length;

        int visited[][] = new int[n][m];
        int t = 0;
        int freshOrangeCount = 0;
        Queue<CustomQueueObject> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (adj[i][j] == 2) {
                    visited[i][j] = 2;
                    queue.add(new CustomQueueObject(i, j, t));
                } else {
                    visited[i][j] = 0;
                }
                if (adj[i][j] == 1)
                    freshOrangeCount++;
            }
        }

        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};
        int timeMax = 0;
        int crossCheckRottened = 0;
        while (!queue.isEmpty()) {
            CustomQueueObject customQueueObject = queue.poll();
            int i = customQueueObject.x;
            int j = customQueueObject.y;
            int time = customQueueObject.t;
            timeMax = Math.max(time, timeMax);
            for (int k = 0; k < 4; k++) { // to watch adj side
                int nrow = i + row[k];
                int ncol = j + col[k];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && adj[nrow][ncol] == 1) {
                    queue.add(new CustomQueueObject(nrow, ncol, time+1));
                    visited[nrow][ncol] = 2;
                    crossCheckRottened++;
                }
            }
        }
        if(crossCheckRottened==freshOrangeCount){
            System.out.println(timeMax);
        }else{
            System.out.println(-1);
        }

    }
}

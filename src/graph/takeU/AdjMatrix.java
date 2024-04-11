package graph.takeU;

import java.util.Scanner;

public class AdjMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int adj[][] = new int[m + 1][m + 1];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int j = sc.nextInt();
            adj[k][j] = 1;
            adj[j][k] = 1;
        }
        for (int i = 0; i < m + 1; i++){
            for (int j = 0; j < m + 1; j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}

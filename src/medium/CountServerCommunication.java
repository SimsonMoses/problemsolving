package medium;

public class CountServerCommunication {
    public static void main(String[] args) {
        int grid[][] = {{1, 0}, {1, 1}};
        CountServerCommunication countServerCommunication = new CountServerCommunication();
        System.out.println(countServerCommunication.countServers(grid));
    }

    public int countServers(int[][] grid) {
        int total = 0;
        int nocom = 0;
        int n = grid.length, m = grid[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    total++;
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && (row[i]>1 || col[j]>1)){
                    nocom++;
                }
            }
        }

        return nocom;
    }

}

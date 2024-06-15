package graph.problem;

public class ReplaceOs {

    static void dfs(int row,int col, int visited[][],int mat[][],int nrow[],int ncol[]){

    }

    static char[][] fill(int n, int m, char a[][])
    {
        int row[] = {-1,0,1,0};
        int col[] = {0,1,0,-1};
        Boolean visited[][] = new Boolean[n][m];
        for (int i = 0; i < n; i++) {
            // first row
            if(!visited[0][i] &&a[0][i]=='O'){

            }
            //last row
            if(!visited[n-1][i] && a[n-1][i]=='O'){

            }
        }
        return null;

    }

    public static void main(String[] args) {



    }
}

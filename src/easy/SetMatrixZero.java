package easy;

import java.util.HashMap;
import java.util.Map;

public class SetMatrixZero {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        SetMatrixZero setMatrixZero = new SetMatrixZero();
        setMatrixZero.setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {


        int rows = matrix.length;
        int cols = matrix[0].length;
//        int row[] = new int[rows];
//        int col[] = new int[cols];
        HashMap<Integer, Map<Integer,Integer>> map = new HashMap<>();
        int m = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    HashMap<Integer,Integer> map1 = new HashMap<>();
                    map1.put(i,j);
                   map.put(m++,map1);
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
//                if(row[i]==1 || col[j]==1){
//                    continue;
//                }
//                if(matrix[i][j]==0){
//                    row[i]=1;
//                    col[j]=1;
//                    setZeroes2(matrix,rows,cols,i,j);
//                }
                Map<Integer,Integer> map1 = new HashMap<>();
                map1.put(i,j);
                if(map.containsValue(map1)){
                    setZeroes2(matrix,rows,cols,i,j);
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix,int row, int col,int ri,int cj) {
        for(int i=0;i<row;i++){
            matrix[i][cj]=0;
        }
        for(int j=0;j<col;j++){
            matrix[ri][j]=0;
        }
    }
}

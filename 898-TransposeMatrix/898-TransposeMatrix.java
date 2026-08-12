// Last updated: 8/12/2026, 10:20:59 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int[][]tm = new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                tm[j][i]=matrix[i][j];
            }
        }
        return tm;

    }
}
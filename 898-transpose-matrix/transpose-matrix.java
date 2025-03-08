class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int result[][]  = new int[c][r];
        int i,j;
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] newMatrix=new int[n][n];
        // copy all the eleemnts to a new matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newMatrix[i][j]=matrix[i][j];
            }
        }
        // then change it
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][n-1-i]=newMatrix[i][j];
            }
        }

    }
}
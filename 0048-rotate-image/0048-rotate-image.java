class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // optimal soln
        // Transpose 
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // Reverse a col
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }



        // Brute force soln
        // int [][] newMatrix=new int[n][n];
        // // copy all the eleemnts to a new matrix
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         newMatrix[i][j]=matrix[i][j];
        //     }
        // }
        // // thenchange 
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[j][n-1-i]=newMatrix[i][j];
        //     }
        // }

    }
}
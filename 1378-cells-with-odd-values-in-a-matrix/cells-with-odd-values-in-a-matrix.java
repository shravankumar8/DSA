class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // Initialize the matrix with dimensions m x n
        int[][] matrix = new int[m][n];
        
        // Apply the row and column increments
        for (int[] index : indices) {
            // Increment the entire row at index[0]
            for (int i = 0; i < n; i++) {
                matrix[index[0]][i]++;
            }
            
            // Increment the entire column at index[1]
            for (int i = 0; i < m; i++) {
                matrix[i][index[1]]++;
            }
        }

        // Count the number of odd cells
        int odd = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] % 2 != 0) {
                    odd++;
                }
            }
        }

        return odd;
    }
}

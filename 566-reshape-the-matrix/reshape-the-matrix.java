class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
            int originalRows = mat.length;
        int originalCols = mat[0].length;

        // Check if reshaping is possible
        if (originalRows * originalCols != r * c) {
            return mat; // Return the original matrix if reshaping isn't possible
        }
        int[][] newMat = new int[r][c];
        ArrayList<Integer> finalArr = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                finalArr.add(mat[i][j]);

            }
        }
        int pointer=0;
         for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
              newMat[i][j]=finalArr.get(pointer);
              pointer++;


            }
        }
        return newMat;
    }
}
class Solution {
   public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> minRow = new ArrayList<>();
        ArrayList<Integer> colMax = new ArrayList<>();
        ArrayList<Integer> finalArr = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minRow.add(min);
        }
//          finding the max valiues in each cil
            int cols = matrix[0].length;
            for (int j = 0; j < cols; j++) {
                int max = Integer.MIN_VALUE;
                for (int[] row : matrix) {
                    if (row[j] > max) {
                        max = row[j];

                    }
                }
                colMax.add(max);
            }

        
        for (int min : minRow) {
            if (colMax.contains(min)) {
                finalArr.add(min);
            }
        }
        return finalArr;

    }
}
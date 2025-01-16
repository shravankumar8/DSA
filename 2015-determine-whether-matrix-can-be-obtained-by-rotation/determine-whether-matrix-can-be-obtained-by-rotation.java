class Solution {
    public static int[][] rotateMatrix(int[][] num) {
        int[][] num1 = new int[num.length][num[0].length];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                num1[j][num[i].length - 1 - i] = num[i][j];
            }
        }

        return num1;

    }

    public boolean recur(int[][] mat, int[][] target, int index) {
        if (index == 4) {
            return false;
        }
        if (isSame(mat, target)) { // If mat matches target, return true
            return true;
        }
        int[][] rotatedMatri = rotateMatrix(mat);

        return recur(rotatedMatri, target, index+1);
    }

    public boolean isSame(int[][] mat , int[][]target ){
         for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j]) {
                   return false;


                }
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        // here we call the recusrive function 
        return recur(mat,  target,0);


    }
}
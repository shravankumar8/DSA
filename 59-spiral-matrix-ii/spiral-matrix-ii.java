class Solution {
   public static int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int left=0;
        int right=n-1;
        int top=0;
        int buttom=n-1;
        int num=1;
        while(left<=right && top<=buttom){
            for(int i=left;i<=right;i++){
                mat[top][i]=num++;

            }
            top++;
            for (int i = top; i <= buttom; i++) {
                mat[i][right] = num++;

            }
            right--;

            if(top<=buttom){

                for (int i = right; i >=left; i--) {
                    mat[buttom][i] = num++;

                }
                buttom--;
            }
            if (left <= right) {

                for (int i = buttom; i >= top; i--) {
                    mat[i][left] = num++;

                }
                left++;
            }

        }
    


return mat;

    }
}
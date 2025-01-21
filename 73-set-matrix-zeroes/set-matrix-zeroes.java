class Solution {
   public  void setZeroes(int[][] matrix) {
     ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);

                }
            }

        }
        for(int row:rows){
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j]=0;
            }
        }

         for(int col:cols){
            for(int j=0;j<matrix.length;j++){
                matrix[j][col]=0;
            }
        }
        
          

    
        }
}
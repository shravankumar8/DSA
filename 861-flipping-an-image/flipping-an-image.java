class Solution {
    public void rev(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++ ;
            j--;
        }

    }
    public int[][] flipAndInvertImage(int[][] image) {
        for( int[] list : image){
            rev(list);

        } 
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j]=image[i][j]^1;
            }
        }
        return image;
    }
}
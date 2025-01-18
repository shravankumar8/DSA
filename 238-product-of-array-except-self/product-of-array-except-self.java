class Solution {
   public  int[]  productExceptSelf(int[] nums) {
          int n = nums.length;
       
        int[] resultArr= new int[n];


        int prefixProduct=1;
        for(int i=0;i<nums.length;i++){
             resultArr[i]=prefixProduct;
            prefixProduct*= nums[i];
            
        }

        int postfixProduct=1;
        // postfix here
        for(int i=nums.length-1;i>=0;i--){
              resultArr[i] *= postfixProduct;
            postfixProduct *= nums[i];
          

        }
     
        return resultArr;
        
    }
}
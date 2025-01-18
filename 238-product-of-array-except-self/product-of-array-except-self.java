class Solution {
   public  int[]  productExceptSelf(int[] nums) {
          int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] resultArr= new int[n];


        int prefixProduct=1;
        for(int i=0;i<nums.length;i++){
            prefixProduct*= nums[i];
             prefix[i]=prefixProduct;
        }

        int postfixProduct=1;
        // postfix here
        for(int i=nums.length-1;i>=0;i--){
            postfixProduct *= nums[i];
            postfix[i] = postfixProduct;

        }
        for(int i=0;i<nums.length;i++){
            int prefixProductExceptSelf = (i > 0) ? prefix[i - 1] : 1;
            
            int postfixProductExceptSelf = (i < n - 1) ? postfix[i + 1] : 1;

           
            resultArr[i] = prefixProductExceptSelf * postfixProductExceptSelf;
        }
        return resultArr;
        
    }
}
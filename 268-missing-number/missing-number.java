class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>=nums.length){
                i++;
                continue;
            }
           int correctIndex=nums[i];
            if(nums[correctIndex]!=nums[i]){
                int temp=nums[correctIndex];
               nums[correctIndex]= nums[i];
               nums[i]=temp;

            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }
        return nums[nums.length-1]+1;
    }
}
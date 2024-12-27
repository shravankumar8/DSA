class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] list={-1,-1};
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                // swap
                int temp=nums[i];
                 nums[i]=nums[correctIndex];
                 nums[correctIndex]=temp;

            }else{
                i++;
            }
        }
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            list[0]=nums[j];
            list[1]=j+1;
            break;
        }
    }

return list;
    }
}
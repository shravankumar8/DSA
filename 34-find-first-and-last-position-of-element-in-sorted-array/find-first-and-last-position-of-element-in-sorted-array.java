class Solution {
    public int lowerBound(int [] nums,int target){
        int ans=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }


     public int upperBound(int [] nums,int target){
        int ans=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       int[] list ={-1,-1};
       int n=nums.length;
       int lb=lowerBound(nums,target);
        if (lb == n || nums[lb] != target) {
            return list;
         }

       
    list[0]=lb;
      list[1]=upperBound(nums,target)-1;
       
     return list;
    }
}
class Solution {
    public int maxm(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public boolean isPossible(int[] nums, int threshold, int m) {
        int sum = 0;
       
        for (int i = 0; i < nums.length; i++) {
                sum = sum + (int) Math.ceil((double) nums[i] / m); 
        }
        if (sum <= threshold) {
            return true;
        }
        return false;

    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=maxm(nums);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(nums, threshold, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
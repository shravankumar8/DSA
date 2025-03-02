class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n= nums.length;
        int[] result = new int[n];
        Arrays.fill(result,-1);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<2*n;i++){
            int actualIndex=i%n;
            while(!stack.isEmpty()&& nums[actualIndex]>nums[stack.peek()]){
                int poppedIndex=stack.pop();
                result[poppedIndex]=nums[actualIndex];
            }
            if(i<n){
                stack.push(actualIndex);
            }
        }
        return result;
    }
}
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> targetList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            targetList.add(index[i], nums[i]);
        }

        int [] Target= new int[nums.length];
        for(int j=0;j<nums.length;j++){
            Target[j]=targetList.get(j);
        }
        return Target;
    }
}
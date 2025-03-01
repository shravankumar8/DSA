class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums1index= new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int val=nums1[i];
            int max=-1;

            for(int j=0;j<nums2.length;j++){
                if(val==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>val){
                            max=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            nums1index[i]=max;

        }
        return nums1index;
    }
}
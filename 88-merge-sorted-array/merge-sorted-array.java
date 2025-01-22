class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                list.add(nums1[left]);
                left++;
            } else {
                list.add(nums2[right]);
                right++;
            }
        }
        while (left < m) {
            list.add(nums1[left]);
            left++;

        }
        while (right < n) {
            list.add(nums2[right]);
            right++;

        }
        for (int i = 0; i < list.size(); i++) {
          
                nums1[i] = list.get(i);
           
        }

    }
}
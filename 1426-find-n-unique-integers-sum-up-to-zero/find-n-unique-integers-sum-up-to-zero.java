class Solution {
    public int[] sumZero(int n) {
        List<Integer> list = new ArrayList<>();
        int[] list1 = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            list.add(i);
            list.add(-i);
        }
        if (n % 2 != 0) {
            list.add(0);
        }
        for (

                int i = 0; i < list.size(); i++) {
            list1[i] = list.get(i);
        }
        return list1;

    }
}
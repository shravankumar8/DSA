class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
            HashMap<Integer, Integer> countMap = new HashMap<>();
            for(int num :nums){
                 countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                

            }
            List<Integer> result = new ArrayList<>();
            for(int key: countMap.keySet()){
                if(countMap.get(key)>nums.length/3){
                    result.add(key);
                }
            }
    return result;
    }
}
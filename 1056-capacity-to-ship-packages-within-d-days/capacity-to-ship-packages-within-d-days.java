class Solution {
    public int maxx(int[] weights){
        int max=0;
        for(int i=0;i<weights.length;i++){
           max = Math.max(max, weights[i]);
        }
        return max;
    }

    public int daysReq(int[] weights, int capacity) {
        int load = 0;
        int days = 1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }

    

    public int shipWithinDays(int[] weights, int days) {

        
        int low = maxx(weights);
        int ans=0;
        int high =0;
        for (int w : weights) {
            high += w; // Sum up all weights for the upper bound
        }
        while (low <= high) {
            int mid=(low+high)/2;
            int dayReq=daysReq(weights, mid);
            if(dayReq<=days){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
    return ans;
    }
}
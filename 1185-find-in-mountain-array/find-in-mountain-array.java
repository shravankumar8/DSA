/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    static int findPeak(MountainArray mountainArr ){
        int low=0;
        int high=mountainArr.length()-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    static int ASC(MountainArray mountainArr, int low,int high,int target){
        // normal binary search for ascending array elements 
        int mid=low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(mountainArr.get(mid)==target){
            return mid;
        }
        if(target>mountainArr.get(mid)){
            return ASC(mountainArr,mid+1,high,target);
        }
        return ASC(mountainArr,low,mid-1,target);
    }
    static int DSC(MountainArray mountainArr,int low,int high,int target){
        // searching happens for the decreasing peart oof the mountain 
        int mid = low + (high - low) / 2;
        if(low>high){
            return -1;
        }
        if(mountainArr.get(mid)==target){
            return mid;
        }
        if(target>mountainArr.get(mid)){
            return DSC(mountainArr,low,mid -1,target);
        }
        return DSC( mountainArr, mid+1,high, target);
        

    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        // finding the peak of the mountain array
        int peak=findPeak(mountainArr);
        
        int result=-1;
        // searching if the first index oof the target is found in the first instance left side
         result=ASC( mountainArr,0,peak,target);
         if(result==-1){
            // if the target is not found left start searching on the right side 
            result=DSC(mountainArr, peak,  mountainArr.length()-1, target);
        }

         return result;

    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestStr="";
         if (strs == null || strs.length == 0) {
            return "";
        }
        java.util.Arrays.sort(strs);
        String first=strs[0];
       String last = strs[strs.length - 1];
       int i=0;
       while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
        i++;
       }
       return first.substring(0,i);
    }

}
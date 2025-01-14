class Solution {
      public boolean checkIfPangram(String sentence) {
        for(char chr='a';chr<='z';chr++){
            if(sentence.indexOf(chr) == -1){
                return false;
            }
        }
        return true;

    }
}
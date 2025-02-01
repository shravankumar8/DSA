class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        // so the approach is very simple
        // we just create a string builder of words when ever we find a space
        // we just push whats available in the string builder to the stack
        // and reset the stringBuilder
        for (char c : s.toCharArray()) {
            if (c == ' ') {

                if(str.length()>0){
                stack.push(str.toString());
                str.setLength(0);

                }

            }else{
                str.append(c);
            }
        }
if (str.length() > 0) {
            stack.push(str.toString());
        }

  StringBuilder result = new StringBuilder();
//   so now the stack is filled with words of what the string has contained
// now out goal is ot pop off the elemenrts oone by one from the stack top andf push them to the 
// string BUldert 
while (!stack.isEmpty()){
    result.append(stack.pop()).append(" ");
}

return result.toString().trim();
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char it:s.toCharArray()){
            if(it=='(' || it=='{' || it=='['){
                stack.push(it);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char ch=stack.pop();
                if(ch=='(' && it==')'|| ch=='{' && it=='}' || ch=='[' && it==']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

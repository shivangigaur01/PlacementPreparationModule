class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output=strs[0];
        for(int i=1;i<strs.length;i++){
            output=compare(output,strs[i]);
        }
        return output;
    }
    String compare(String s1,String s2){
        int len=Math.min(s1.length(),s2.length());
        int i=0;
        for( i=0;i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
        }
        return s1.substring(0,i);
    }
}

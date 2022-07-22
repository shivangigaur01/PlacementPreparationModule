class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        help(0,s,ans,new ArrayList<>());
        return ans;
    }
    public void help(int index,String s,List<List<String>> ans,List<String> ds){
        if(index==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(palindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                help(i+1,s,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
        
    }
    public boolean palindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}

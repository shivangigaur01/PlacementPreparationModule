class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        Arrays.sort(c);
        List<List<Integer>> ans=new ArrayList<>();
        help(0,c,new ArrayList<>(),target,ans);
        return ans;
        
    }
    public void help(int index,int c[],List<Integer> ds,int target,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<c.length;i++){
            if(i>index && c[i]==c[i-1])continue;
            if(c[i]>target)break;
            ds.add(c[i]);
            help(i+1,c,ds,target-c[i],ans);
            ds.remove(ds.size()-1);
        }
    }
}

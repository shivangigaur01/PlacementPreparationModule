class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        help(0,c,target,new ArrayList<>(),ans);
        return ans;
    }
    public void help(int index,int c[],int target,List<Integer>ds,List<List<Integer>> ans){
        if(index==c.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(c[index]<=target){
            ds.add(c[index]);
            help(index,c,target-c[index],ds,ans);
            ds.remove(ds.size()-1);
        }
        help(index+1,c,target,ds,ans);
    }
}

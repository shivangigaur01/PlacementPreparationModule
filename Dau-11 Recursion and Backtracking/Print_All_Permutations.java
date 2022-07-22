class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        help(nums,new ArrayList<>(),ans);
        return ans;
    }
    public void help(int nums[],ArrayList<Integer> ds,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ds.contains(nums[i]))continue;
            ds.add(nums[i]);
            help(nums,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}

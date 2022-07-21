class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int index = 0;
        ss(index,nums,ans,new ArrayList<>());
        return ans;
    }
    static void ss(int ind,int a[],List<List<Integer>> ans,List<Integer> ds) {
		// add ds to our ans list
        ans.add(new ArrayList<>(ds));
        for(int i = ind; i < a.length; i++) {
            if(i > ind && a[i] == a[i-1]) continue; // avoid duplicates
            ds.add(a[i]);
            ss(i+1,a,ans,ds); // call for next index
            ds.remove(ds.size()-1);
        }
    }
}

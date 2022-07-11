class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ans=0;
        for(int n:nums){
            if(c==0){
                ans=n;
            }
            if(n!=ans){
                c--;
            }
            else{
                c++;
            }
        }
        return ans;
    }
}

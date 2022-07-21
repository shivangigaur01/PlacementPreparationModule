class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        help(0,0,arr,N,ans);
        Collections.sort(ans);
        return ans;
    }
    public void help(int index,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> ans){
        if(index==N){
            ans.add(sum);
            return;
        }
        help(index+1,sum+arr.get(index),arr,N,ans);
        help(index+1,sum,arr,N,ans);
    }
}

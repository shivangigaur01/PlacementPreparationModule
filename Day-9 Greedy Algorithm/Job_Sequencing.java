class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)-> (b.profit-a.profit));
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>maxi){
                maxi=arr[i].deadline;
            }
        }
        int result[]=new int[maxi+1];
        for(int i=1;i<=maxi;i++){
            result[i]=-1;
        }
        int couunt=0;
        int pro=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(result[j]==-1){
                    result[j]=i;
                    couunt++;
                    pro=pro+arr[i].profit;
                    break;
                }
            }
        }
        int ans[]=new int[2];
        ans[0]=couunt;
        ans[1]=pro;
        
        return ans;
    }
    
}

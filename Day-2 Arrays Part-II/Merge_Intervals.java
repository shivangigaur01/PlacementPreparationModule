class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]>ans =new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return ans.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>end){
                ans.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
            else if(intervals[i][1]>=end){
                end=intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][1]);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
       Map<Integer,Boolean> map=new HashMap<>();
	   //for(int i=0;i<n;i++){
	   for(int val:nums){
	       map.put(val,true);
	   }
	   for(int val:nums){
	       if(map.containsKey(val-1)){
	           map.put(val,false);
	       }
	   }
	   int max=0;
	   int ms=0;
	   for(int val:nums){
	       if(map.get(val)==true){
	          int l=1;
	           int ls=val;
	       
	       while(map.containsKey(ls+l)){
	           l++;
	       }
	       if(l>max){
	           ms=ls;
	           max=l;
	       }
	   }
	   }
        return max;
    }
}

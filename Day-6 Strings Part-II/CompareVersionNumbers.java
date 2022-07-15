class Solution {
    public int compareVersion(String version1, String version2) {
        String [] version1Arrs = version1.split("\\.");
  String [] version2Arrs = version2.split("\\.");
  
  int l1 = version1Arrs.length;
  int l2 = version2Arrs.length;
  int max=Math.max(l1,l2);
  for(int i = 0; i < max; i++) {
    
    int val1 = i < l1?Integer.parseInt(version1Arrs[i]):0;
    int val2 = i < l2?Integer.parseInt(version2Arrs[i]):0;
    
    if(val1 > val2) return 1;
    else if(val1 < val2) return -1;
    
  }
  return 0;
    }
}

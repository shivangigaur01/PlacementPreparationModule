class Solution {
    public int strStr(String h, String n) {
       int l1 = h.length(), l2 = n.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (h.substring(i,i+l2).equals(n)) {
                return i;
            }
        }
        return -1;
    
    }
}

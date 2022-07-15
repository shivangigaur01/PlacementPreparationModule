class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toLowerCase().toCharArray();
        Arrays.sort(a);
        char b[]=t.toLowerCase().toCharArray();
         Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}

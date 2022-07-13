class Solution {
    public String reverseWords(String str) {
        int n = str.length();
		StringBuffer ans = new StringBuffer("");
		int i = 0;

		while (i < n) 
		{
			int j = i;

			while (j < n && str.charAt(j) == ' ') 
			{
				j++;
			}

			StringBuffer currentWord = new StringBuffer("");

			while (j < n && str.charAt(j) != ' ') 
			{
				currentWord.append(str.charAt(j));
				j++;
			}

			if (currentWord.length() != 0) 
			{
				ans.insert(0, currentWord + " ");
			}

			i = j + 1;
		}

		if (ans.length() == 0) 
		{
			return ans.toString();
		}
		return ans.substring(0, ans.length() - 1).toString();	
    }
}

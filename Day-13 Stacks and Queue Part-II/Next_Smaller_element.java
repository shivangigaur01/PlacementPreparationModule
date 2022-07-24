import java.util.ArrayList;
public class Solution{
    public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
   		 for (int i = 0; i < n; i++) {
        	ans.add(-1);
        	for (int j = i + 1; j < n; j++) {
            	if (arr.get(i) > arr.get(j)) {
					ans.set(i, arr.get(j));
                	break;
            	}
        	}	
    	}

        return ans;
    }
}

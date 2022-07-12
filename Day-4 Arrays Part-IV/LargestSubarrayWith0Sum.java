 int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int ml=0;
        int i=-1;
        int sum=0;
        map.put(sum,i);
        while(i<arr.length-1){
            i++;
            sum=sum+arr[i];
            if(map.containsKey(sum)==false){
                map.put(sum,i);
            }
            else{
                int l=i-map.get(sum);
                if(l>ml){
                    ml=l;
                }
            }
        }
        return ml;
    }

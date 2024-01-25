 static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele : a)
        {
            mp.put(ele,mp.getOrDefault(ele,0)+1)
            ;
        }
        for(int ele : a)
        {
            int c = mp.getOrDefault(ele,0);
            if(c>size/2)
            {
                return ele;
            }
        }
        return -1;
    }

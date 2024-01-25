public int peakElement(int[] arr,int n)
    {
        int r= 0;
        int max = Integer.MIN_VALUE;
       //add code here.
       for(int i=1;i<n;i++)
       {
           if(arr[i]>arr[i-1])
           {
               max = arr[i];
               r = i;
           }
           
       }
       return r;
    }

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            
            a[i] = arr[i];
            
        } 
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a[0])
            {
                return i;
            }
            
        }
        return -1;
    }
}

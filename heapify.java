class buildHeapify
{

public void heapify(int[] arr,int N;int i)
{
int largest = i
int l = 2*i+1;
int r = 2*i+2;
if(l<N && arr[l]>arr[largest])
{
    
largest  = l;

}
if(r<N && arr[r] > arr[largest])
{

    largest = r;
}
if(largest!=i)
{

    int tem = arr[largest];
    arr[largest] = arr[i];
    arr[i] = tem;
}
heapify(arr,N,largest);
}
void heap(int[] arr, int N)
{
    int index = (N/2)-1;
    
for(int i=index;i>=0;i--)
{


    heapify(arr,N,i)
}
}
void printHeap(int[] arr,int N)
{

    for(int i=0;i<N;i++)
    {

        System.out.print(arr[i]+ " ");
    }
}
public static void main(String, args[])
{

int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = arr.length;
       
        heap(arr, N);
        printHeap(arr, N);

}



}
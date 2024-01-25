long floorSqrt(long x)
	 {
		// Your code here
	if(x==0 || x==1)
	{
	    return x;
	
	
	 }
	 long res= 1;
	 while((res*res)<= x)
	 
	 {
	     res++;
	    
	     
	 }
	 return res -1;
}

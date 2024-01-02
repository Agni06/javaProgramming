*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
    int x=0;
    int y=0;
    for(int i =0;i<5;i++)
    {
        
        if((++x>2)||(++y>2))
        { x++;
        
        }
        
    }
     System.out.println(x+" "+y );

      for(int i =0;i<5;i++)
    {
        
        if((++x>2)&&(++y>2))
        { x++;
        
        }
        
    }
    System.out.println(x+" "+y );

	}
}

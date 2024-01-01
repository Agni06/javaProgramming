class test
{
int sum(int a,int b)
{

return a+b;

}
static int multiply(int a,int b)
{

return a*b;

}
}

class main 
{
 public static void main( String[] args ) {

Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

test obj = new test();
int sum = obj.sum(n1,n2);
int mul = obj.multiply(n1,n2);

System.out.println(sum);
System.out.println(mmul);


}

}


class test extends Thread
{

 public void run(){  
    System.out.println("Thread is running.");  
  }  
}
 public static void main(String args[]){  

test t = new test();
System.out.println("Name of thread 't':"+ t.getName());  
t.start();
t.setName("NPTEL");
System.out.println("New name of thread 't':"+ t.getName());  
}

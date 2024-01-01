interface A
  {

    public abstract void run();
    
  }

class B implements A
  {

    public void run();
    
  }

class myThread extends B
  {
    public void run()
    {
      System.out.print("NPTEL Java");
    }
  }

class test
  {
    public static void main(String, args[])
    {

      myThread t = new MyThread();
      t.run();
      
    }
  }

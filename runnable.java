class test implements Runnable 
  {

    public void run()
    {
       System.out.print("Thread using Runnable interface.");


      
    }

    class main
      {

        public static void main(String,args)
        {
          test obj = new test();
          Thread  t = new Thread(obj);
          t.start();
          
        }
      }
  }

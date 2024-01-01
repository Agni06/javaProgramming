class test extends thread
  {
     public void run(){
  System.out.print("Thread is Running.");  
  }

    public static void main(String args[]){  
      test t = new test();

      t.start();
      
    }
  }

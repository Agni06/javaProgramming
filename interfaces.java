interface first
  {

    default void show()
    {
      System.out.println("Default method implementation of First interface."); 
    }
  }

interface second
  {

    default void show()
    {

      System.out.println("Default method implementation of Second interface."); 
    }
  }

class test implements first, second
  {

    public void show();
    first.super.show();
second.super.show();



  }

public static void main(String,args[])
  {

  test t = new test();
  t.show();
  }

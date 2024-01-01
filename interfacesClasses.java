interface extraLarge
  {

    String extra = "This is extra-large";
	public void display();
  }

class large
  {
    public void print()
    {

      System.out.println("This is large");
    }
  }

class medium extends large
  {

    public void print()
    {
    super.print();

System.out.println("This is medium");

    }
  }

class small extends large
  {

    public void print()
    {
      super.print();
      System.out.println("This is small");
    }
  }

class main implements extraLarge
  {

    public void display()
    {

      System.out.println(extra);
      
    }
  }

public static void main(String,args[])
  {

  small  s = new small();
  s.print();
  main m = new main();
  m.display();
  
  }

//To call default constructor first and then any other constructor in the class Answer.

class main
  {

    public static void main(String, args)
    {

      test t = new test(10,"MCQ");
      
    }
  }
class test
  {

    test()
    {
      System.out.println("You got nothing.");
    }

    test(int marks,String type)
    {

      this();
      System.out.println("You got "+marks+" for an "+ type);
      
    }
  }

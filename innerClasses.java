class school
  {
    class student
      {
         public void print() { 
			System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL."); 

        } 

        
      }
  }

class main
  {

    public static void main(String, args[])
    {

      school.student s =  new school().new student();

      s.print();
      
      
    }
  }

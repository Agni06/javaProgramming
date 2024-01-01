class school
  {
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 

    
  }

class student
  {

    public void print() { 
		System.out.println("Hi! I class student."); 
    } 
  }

class main
  {

    public static void main(String, args[])
    {
      student st = new student();
      st.print();
      school sc = new school();
      sc.print();
      
      

      
    }
  }

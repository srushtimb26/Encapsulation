package HelloWorld;

public class Student {
	String Name ;
	int Age; 
      void introduce() {
    	  System.out.println("I am " + Name  + ",Age " + Age);
    }
     public static void main(String args[]) {
     
   Student s = new Student(); //  object
   s.Name = "Srushti"; 
   s.Age = 21;
   s.introduce();
     }
}
 



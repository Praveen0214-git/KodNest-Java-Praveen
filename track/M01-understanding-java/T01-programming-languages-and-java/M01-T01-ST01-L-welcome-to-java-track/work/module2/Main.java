
class Student {
   int roll;
   String name;
   double marks;

   void run(){
      System.out.println("Running");
   }
   void study(){
      System.out.println("Studying");
   }
}
 public class Main {
      public static void main(String[] args) {
        Student s1 = new Student();

        s1.roll = 41;
        s1.name ="Praveen";
        s1.marks= 69;


        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.run();
        s1.study();
     
   }
}
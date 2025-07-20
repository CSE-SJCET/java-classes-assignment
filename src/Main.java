class Student{
     String name;
     int rollnumber;
     char grade;
     Student(){
          name="Sidharth.s";
          rollnumber=65;
          grade='A';
     }
     public void displayDetails(){
          System.out.println("name:\t"+name);
          System.out.println("rollnumber:\t"+rollnumber);
          System.out.println("grade:\t"+grade);
     }
}
public class Main {
      public static void main(String[] args) {
           Student student=new Student();
           student.displayDetails();
    }
}


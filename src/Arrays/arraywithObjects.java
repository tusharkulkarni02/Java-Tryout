class Student{
  public int roll_no;
  public String name;
  public double percentage;
}

// creating an array of objects of a class.
// array datatype should be the class name.
// Each entry of the array is an object of the class.

public class arraywithObjects {
  public static void main(String[] args) {
      
      Student s1 = new Student();
      s1.name = "Alex";
      s1.roll_no = 34;
      s1.percentage = 45.343;
      
      Student s2 = new Student();
      s2.name = "Kamala";
      s2.roll_no = 43;
      s2.percentage = 65.343;
      Student s3 = new Student();
      s3.name = "Donald";
      s3.roll_no = 69;
      s3.percentage = 69.69;
      Student s4 = new Student();
      s4.name = "Barney";
      s4.roll_no = 99;
      s4.percentage = 35.35;

      Student arr[] = new Student[4];
      
      arr[0] = s1;
      arr[1] = s2;
      arr[2] = s3;
      arr[3] = s4;

      for(Student s:arr){
        System.out.println(s.name + "got " + s.percentage + "%");
      }
      
  }  
}

// This is the second way to custom sort the give data in java
// Here we actually implement the sorting logic inside the class.
// To achieve this we will have to implement the comparable interface.
// And use its compareTo() method

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
  public String name;
  public int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

  public int compareTo(Student that){
     if(this.age<=that.age){
      return 1;
     }else{
      return -1;
     }
  }
  
}

public class UsingComparableClass {
  public static void main(String[] args) {
    // Here we are implementing a comparator function, to custom sort the give data according to our need.
    // The comparator class method compulsorily returns a int type output.
    
    // THIS IS NOT REQUIRED AS WE HAVE IMPLEMENTED THE COMPARABLE CLASS AND USED ITS compareTo() method.
    // Comparator<Student> comp = new Comparator<Student>(){
    //   public int compare(Student a, Student b){
    //     if(a.age<=b.age){
    //       return 1;
    //     }else{
    //       return -1;
    //     }
    //   }
    // };


    List<Student> stud = new ArrayList<>(); 
    stud.add(new Student("Ramesh", 21));
    stud.add(new Student("Nagesh", 27));
    stud.add(new Student("Bhageyesh", 29));
    stud.add(new Student("Jignesh", 24));

    Collections.sort(stud);

    for(Student s: stud){
      System.out.println(s);
    }
    
  }
}

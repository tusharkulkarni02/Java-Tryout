
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
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
  
}

public class UsingComparator {
  public static void main(String[] args) {
    // Here we are implementing a comparator function, to custom sort the give data according to our need.
    // The comparator class method compulsorily returns a int type output.
    
    Comparator<Student> comp = new Comparator<Student>(){
      public int compare(Student a, Student b){
        if(a.age<=b.age){
          return 1;
        }else{
          return -1;
        }
      }
    };


    List<Student> stud = new ArrayList<>(); 
    stud.add(new Student("Ramesh", 21));
    stud.add(new Student("Nagesh", 27));
    stud.add(new Student("Bhageyesh", 29));
    stud.add(new Student("Jignesh", 24));

    Collections.sort(stud, comp);

    for(Student s: stud){
      System.out.println(s);
    }
    
  }
}

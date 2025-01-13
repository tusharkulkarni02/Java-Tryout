class Human{
  private int age;
  private String name;

    public Human() {
      System.out.println("Default constructor");
    }

    public Human(int age, String name) { //parameterized constructor
        this.age = age;
        this.name = name;
    }



  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
}




public class usingconstructors {
  public static void main(String[] args) {
    Human obj1 = new Human();
    obj1.setAge(12);
    obj1.setName("Sachin");
    
    
 }  
}

class Human{
    private int age;
    private String name;

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


// Encapluation is binding of data and data members in a single block of code.


public class gettersetter_and_this {
  public static void main(String[] args) {
     Human obj1 = new Human();
     obj1.setAge(12);
     obj1.setName("Sachin");
     
     
  }  
}

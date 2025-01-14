package AccessModifiers.Experiment.folderB;

import AccessModifiers.Experiment.folderA.*;

public class Demo {
  public static void main(String[] args) {
    
    // Using subclass InheritsA to access protected members
    InheritsA obj = new InheritsA();
    System.out.println("Accessing protected of class A through Inherited class :");
    obj.show();
     // Accessible via inheritance

    // Public data of any class is accessible anywhere.
    int x = obj.visibleToAll;
    System.out.println("Public Data variable of A:" + x);

    InsideA obj1 = new InsideA();
    System.out.println("Printing the visible data and attribute of InsiedA from Demo(this) class");
    System.out.println(obj1.visibleToAll);
    obj1.showPrivateDataOfInsideA();

  }
}

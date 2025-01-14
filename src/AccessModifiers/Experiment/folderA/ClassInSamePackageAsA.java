package AccessModifiers.Experiment.folderA;

public class ClassInSamePackageAsA {
  public static void main(String[] args) {
    // Accessing a protected variable in same package.
    InsideA obj = new InsideA();
    System.out.println("Accessing protected showSeven in same package:" + obj.Dhoni);

  }
}

// But we cannot access the private variables of a class is the same package.
// Only the class which has those private variables can access them.
// So doing, obj.onlyVisibleToTheAClass; will result compilation error.


package AccessModifiers;
import AccessModifiers.Experiment.folderA.*;
import AccessModifiers.Experiment.folderB.*;

public class Home {
  public static void main(String[] args) {
    System.out.println("Accessing public variables of A through home:");
    System.out.println(new InsideA().visibleToAll);
    new InsideA().showPrivateDataOfInsideA();

    System.out.println("Accessing public variables of B through home:");
    System.out.println(new InsideB().variableInsideB);

  }
  
}

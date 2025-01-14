package AccessModifiers.Experiment.folderA;

public class InsideA {
  public int visibleToAll = 6969;

  private String onlyVisibleToTheAClass = "Messi! Messi! Messi! AnkaraMessi! GOOALGOALGOALOLOLOLOLOLOLOLOLOLOLOLO!!!";

  protected String Dhoni = "THALA FOR A REASON! MAHI MAAR RAHA HAI!";

  public void showPrivateDataOfInsideA(){
    System.out.println(onlyVisibleToTheAClass);
  }
}




// Here, enum are treated like a class.
// the constructors are private, because the objects are present in same class.
// We can give the objects in the enum default or usergenerated values.
// We define a constructor accordingly
// We cannot extend an enum.

enum Laptop{
  Dell_XPS(2200), Lenovo_ThinkPad(1800) ,Macbook_Pro(2000), HP_Victus(1500),Microsoft_Surface;

  private int price = 500;

  private Laptop() {
  }

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}




public class EnumLikeClass {
 public static void main(String[] args) {
  for(Laptop L:Laptop.values()){
    System.out.println(L.ordinal()+ " : " + L.name() + " : " + L.getPrice());
  }
 }  
}

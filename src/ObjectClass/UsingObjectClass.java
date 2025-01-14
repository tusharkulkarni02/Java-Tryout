class Laptop{
  public String Brand;
  public int price;
  

  // These toString(), hashCode(), equals() are the methode of Object class in java.
  // We are just overriding it.
  @Override
  public String toString() {
    return "Laptop [Brand=" + Brand + ", price=" + price + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
    result = prime * result + price;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Laptop other = (Laptop) obj;
    if (Brand == null) {
      if (other.Brand != null)
        return false;
    } else if (!Brand.equals(other.Brand))
      return false;
    if (price != other.price)
      return false;
    return true;
  }

  
}
public class UsingObjectClass {
  public static void main(String[] args) {
      
    Laptop L1 = new Laptop();
    L1.Brand = "Dell";
    L1.price = 53453;

    Laptop L2 = new Laptop();
    L2.Brand = "HP";
    L1.price =  67676;

    System.out.println(L1.toString());
    System.out.println(L2.toString());

    L1.equals(L2);
  }  
}

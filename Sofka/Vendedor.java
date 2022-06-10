public class Vendedor extends Persona {
  String sellerId;

  public  Vendedor(String name, String lastname1, String lastname2, String sellerId){
    super(name, lastname1, lastname2);
    this.sellerId = sellerId;
  }
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }
}

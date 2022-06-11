/*La clase Vendedor representa a una persona que interactua en la tienda de frutas y hereda las propiedades de nombre y apellidos de la clase padre Persona
 * @author Diana Carolina Reyes
*/

public class Vendedor extends Persona {
  String sellerId;

  //Se crea el constuctor de vendedor heredando las propiedades y atributos de la clase padre
  public  Vendedor(String name, String lastname1, String lastname2, String sellerId){
    super(name, lastname1, lastname2);
    this.sellerId = sellerId;
  }

  //Se crea el método para mostar el codigo del vendedor
  public String getSellerId() {
    return sellerId;
  }
  //Se crea el método para mostar la información del vendedor
  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }
}

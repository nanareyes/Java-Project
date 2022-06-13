/**
 * La clase Vendedor representa a una persona que interactua en la tienda de frutas y hereda las propiedades de nombre y apellidos de la clase padre Persona
 * @author Diana Carolina Reyes
*/

public class Vendedor extends Persona {
  String sellerId;

  /** Se crea el constuctor de Vendedor heredando las propiedades y atributos de la clase padre 
   * @param name es el nombre del usuario
   * @param lastname1 es el primer apellido del usuario
   * @param lastname2 es el segundo apellido del usuario
   * @param clientCode es el codigo del cliente, un numero diferente a su id
   * **/
  public  Vendedor(String name, String lastname1, String lastname2, String sellerId){
    super(name, lastname1, lastname2);
    this.sellerId = sellerId;
  }

  /**
   * Se crea el metodo set id para  capturar la identificación del vendedor
   * @return el codigo de vendedor
   */
  public String getSellerId() {
    return sellerId;
  }
  //Se crea el método para mostar la información del vendedor
  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }
}

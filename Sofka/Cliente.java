/** La clase Cliente representa a una persona que interactua en la tienda de frutas y hereda las propiedades de nombre y apellidos de la clase padre Persona 
 * @author Diana Carolina Reyes
**/

public class Cliente  extends Persona{
  String clientCode;

  /** Se crea el constuctor de Cliente heredando las propiedades y atributos de la clase padre 
   * @param name es el nombre del usuario
   * @param lastname1 es el primer apellido del usuario
   * @param lastname2 es el segundo apellido del usuario
   * @param clientCode es el codigo del cliente, un numero diferente a su id
   * **/

  public  Cliente(String name, String lastname1, String lastname2, String clientCode){
    super(name, lastname1, lastname2);
    this.clientCode = clientCode;
  }
  /**Se crea el método para mostar la información del cliente
   */

  void printPersona(){
    super.printPersona();
    System.out.println("Nombre del Cliente: " + name + " " + lastName1 + " " + lastName2 + " Codigo de cliente: " + clientCode);
  }

}


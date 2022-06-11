/*La clase Cliente representa a una persona que interactua en la tienda de frutas y hereda las propiedades de nombre y apellidos de la clase padre Persona 
 * @author Diana Carolina Reyes
*/

public class Cliente  extends Persona{
  String clientCode;

  //Se crea el constuctor de Cliente heredando las propiedades y atributos de la clase padre
  public  Cliente(String name, String lastname1, String lastname2, String clientCode){
    super(name, lastname1, lastname2);
    this.clientCode = clientCode;
  }
  //Se crea el método para mostar la información del cliente
  void printPersona(){
    super.printPersona();
    System.out.println("Nombre del Cliente: " + name + " " + lastName1 + " " + lastName2 + " Codigo de cliente: " + clientCode);
  }

}


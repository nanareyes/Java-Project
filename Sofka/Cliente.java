public class Cliente  extends Persona{
  String clientCode;

  //constuctor de la clase padre
  public  Cliente(String name, String lastname1, String lastname2, String clientCode){
    super(name, lastname1, lastname2);
    this.clientCode = clientCode;
  }
  void printPersona(){
    super.printPersona();
    System.out.println("Nombre del Cliente: " + name + " " + lastName1 + " " + lastName2 + " Codigo de cliente: " + clientCode);
  }

}


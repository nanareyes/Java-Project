/* La clase Persona, representa a un individuo que interactura en una tienda de frutas.

@author Diana Carolina Reyes
 */
import java.util.Date;

public class Persona {
  public Integer id;
  public String  name;
  public String  lastName1;
  public String  lastName2;
  protected Date dateBirth;
  public float   height;

  // Se crea constructor de la clase persona
  public Persona(String name, String lastname1, String lastName2){
    this.name = name;
    this.lastName1 = lastname1;
    this.lastName2 = lastName2;
  }

//Se crean los métodos set y get de acuerdo al diagrama sugerido en la actividad
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    System.out.println("Nombre del titular: " + this.name);
    return name;
  }

  // Se crean los métodos get y set para obtener la fecha de cumpleaños de la persona
  public Date getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(Date dateBirth){
    if(dateBirth == null){
      System.out.println("Necesitas asignar la fecha de nacimiento");
  } else{
    this.dateBirth = dateBirth;
  }
  }

  //Se crea el método para mostrar la información de la persona
  void printPersona(){
    if(dateBirth != null){
    System.out.println("Nombre: " + name + " Apellidos: " + lastName1 + " " +lastName2 + " Fecha de cumpleanos: " + dateBirth);
    }
  }
}

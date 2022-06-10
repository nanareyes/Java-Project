import java.util.Date;

public class Persona {
  public Integer id;
  public String  name;
  public String  lastName1;
  public String  lastName2;
  protected Date dateBirth;
  public float   height;

  public Persona(String name, String lastname1, String lastName2){
    this.name = name;
    this.lastName1 = lastname1;
    this.lastName2 = lastName2;
  }


  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    System.out.println("Nombre del titular: " + this.name);
    return name;
  }

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

  void printPersona(){
    if(dateBirth != null){
    System.out.println("Nombre: " + name + " Apellidos: " + lastName1 + " " +lastName2 + " Fecha de cumpleanos: " + dateBirth);
    }
  }
}

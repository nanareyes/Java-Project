import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSofka {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");

    //Se crean una primer instancia de la clase cliente con informacieon básica requerida paramostrar en pantalla
    Cliente cliente1 = new Cliente("Fredy", "Gil", "Mejia", "CC185210001");
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

    // se establece el formato del tipo de dato Date para poder obtener la información de la fecha de cumpleaños de forma faacil y entendible al setearla por el usuario Persona, ya sea cliente o vendedor, para poder imprimir en consola la información obtenida del cliente 1.
    Date birthDay = new Date();
    try {
      birthDay = formatter.parse("1982-04-18");
    } catch (ParseException e) {

      e.printStackTrace();
    }
    cliente1.setDateBirth(birthDay);
    cliente1.printPersona();


    //Se crean una segunda instancia de la clase cliente con informacieon básica requerida paramostrar en pantalla
    Cliente cliente2 = new Cliente("Fredy", "Reyes", "Mantilla", "CC3786400002");
    cliente2.setName("Diana");
    cliente2.printPersona();


  }

}

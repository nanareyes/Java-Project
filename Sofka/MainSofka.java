import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSofka {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");

    Cliente cliente1 = new Cliente("Fredy", "Gil", "Mejia", "CC185210001");
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
    Date birthDay = new Date();
    try {
      birthDay = formatter.parse("1982-04-18");
    } catch (ParseException e) {

      e.printStackTrace();
    }
    cliente1.setDateBirth(birthDay);
    cliente1.printPersona();

    Cliente cliente2 = new Cliente("Fredy", "Gil", "Mejia", "CC185210001");
    cliente2.setName("Diana");
    cliente2.printPersona();


  }

}

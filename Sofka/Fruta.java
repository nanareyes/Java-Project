/* La clase Fruta, representa la mercancia para la venta de una tienda de frutas.

@author Diana Carolina Reyes
 */

import java.util.ArrayList;

public class Fruta {
  String name;
  float  averageWeight;
  ArrayList<String> colors;
  Integer price;

//Se crean los métodos set y get de la clase Fruta de acuerdo al diagrama sugerido en la actividad
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}

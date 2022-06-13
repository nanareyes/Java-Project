/** La clase Pago, representa el metodo de pago usado tienda de frutas.

@author Diana Carolina Reyes
 */

public class Pago {
    Integer id;
    String Card;
    String Cash;
    // se establece el constructor de la clase Pago
    public Pago(Integer id, String card, String cash) {
        this.id = id;
        Card = card;
        Cash = cash;
    }

    // Se crean los métodos get y set para los medios de pago que pueden ser usados en la tienda de frutas
    public String getCard() {
        return Card;
    }
    public void setCard(String card) {
        Card = card;
    }
    public String getCash() {
        return Cash;
    }
    public void setCash(String cash) {
        Cash = cash;
    }


}

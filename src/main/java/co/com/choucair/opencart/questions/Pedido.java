package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Pedido implements Question<Boolean> {

    private String texto1;
    private String texto2;
    private String texto3;

    public Pedido(String texto1, String texto2, String texto3) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
    }

    public static Pedido deLaOrden(String texto1, String texto2, String texto3) {
        return new Pedido(texto1,texto2,texto3);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String respuesta1 = Text.of(OpenCartData.TEXT_ORDER_ID).viewedBy(actor).asString();
        String respuesta2 = Text.of(OpenCartData.TEXT_YOUR_STORE).viewedBy(actor).asString();
        String respuesta3 = Text.of(OpenCartData.TEXT_CUSTOMER).viewedBy(actor).asString();

        if (texto1.equals(respuesta1) && texto2.equals(respuesta2) && texto3.equals(respuesta3)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}

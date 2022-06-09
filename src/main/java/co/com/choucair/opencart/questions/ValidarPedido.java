package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarPedido implements Question<Boolean> {

    private String mensaje;

    public ValidarPedido(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ValidarPedido deLaOrden(String mensaje) {
        return new ValidarPedido(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String respuesta = Text.of(OpenCartData.MENSAJE2).viewedBy(actor).asString();
        if (mensaje.equals(respuesta)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<Boolean> {

    private String mensaje;

    public Validar(String mensaje) {
        this.mensaje = mensaje;
    }

    public static Validar mensaje(String mensaje) {
        return new Validar(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String respuesta = Text.of(OpenCartData.MENSAJE1).viewedBy(actor).asString();
        if (mensaje.equals(respuesta)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

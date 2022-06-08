package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ventas implements Task {
    public static Ventas pedidos() {
        return Tasks.instrumented(Ventas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OpenCartData.BOTON_SALES),
                Click.on(OpenCartData.OPCION_ORDERS)
        );

    }
}

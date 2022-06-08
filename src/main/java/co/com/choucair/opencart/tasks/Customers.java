package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Customers implements Task {

    private OpenCartData openCartData;

    public static Customers customers() {
        return Tasks.instrumented(Customers.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(openCartData.BOTON_CUSTOMERS),
                Click.on(openCartData.SELECCION_CUSTOMERS),
                Click.on(openCartData.BOTON_ADD_NEW)
        );
    }
}

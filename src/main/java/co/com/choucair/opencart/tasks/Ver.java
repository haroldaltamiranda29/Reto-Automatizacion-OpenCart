package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ver implements Task {
    public static Ver orden() {
        return Tasks.instrumented(Ver.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OpenCartData.VER_PEDIDO)
        );
    }
}

package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.models.FiltroOpenCart;
import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Filtro implements Task {

    public Filtro(List<FiltroOpenCart> filtroOpenCarts) {
        this.filtroOpenCarts = filtroOpenCarts;
    }

    List<FiltroOpenCart> filtroOpenCarts;

    public static Filtro datos(List<FiltroOpenCart> filtroOpenCarts) {
        return Tasks.instrumented(Filtro.class,filtroOpenCarts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(filtroOpenCarts.get(0).getOrderID()).into(OpenCartData.ORDER_ID),
                Enter.theValue(filtroOpenCarts.get(0).getCustomer()).into(OpenCartData.CUSTOMER),
                Click.on(OpenCartData.BOTON_FILTRO)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

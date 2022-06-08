package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.models.CustomersOpenCart;
import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Diligenciar implements Task {
    List<CustomersOpenCart> customersOpenCarts;

    public Diligenciar(List<CustomersOpenCart> customersOpenCarts) {
        this.customersOpenCarts = customersOpenCarts;
    }

    private OpenCartData openCartData;

    public static Diligenciar formularios(List<CustomersOpenCart> customersOpenCarts) {
        return Tasks.instrumented(Diligenciar.class, customersOpenCarts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue(customersOpenCarts.get(0).getFirstName()).into(openCartData.CAMPO_FIRST_NAME),
                Enter.theValue(customersOpenCarts.get(0).getLastName()).into(openCartData.CAMPO_LAST_NAME),
                Enter.theValue(customersOpenCarts.get(0).getEmail()).into(openCartData.CAMPO_EMAIL),
                Enter.theValue(customersOpenCarts.get(0).getPassword()).into(openCartData.CAMPO_PASSWORD),
                Enter.theValue(customersOpenCarts.get(0).getConfirm()).into(openCartData.CAMPO_CONFIRM),
               /* Click.on(openCartData.OPCION_ADDRESSES),
                Click.on(openCartData.BOTON_ADD_ADDRESSES),
                Enter.theValue(customersOpenCarts.get(0).getFirstName()).into(openCartData.CAMPO_FIRST_NAME_ADDRESSES),
                Enter.theValue(customersOpenCarts.get(0).getLastName()).into(openCartData.CAMPO_LAST_NAME_ADDRESSES),
                Enter.theValue(customersOpenCarts.get(0).getAddress()).into(openCartData.CAMPO_ADD_ADDRESSES),
                Enter.theValue(customersOpenCarts.get(0).getCity()).into(openCartData.CAMPO_CITY_ADDRESSES),
                Click.on(openCartData.OPCION_COUNTRY),
                Click.on(openCartData.SELECCIONAR_COUNTRY),
                Click.on(openCartData.OPCION_REGION),
                Click.on(openCartData.SELECCIONAR_REGION),
                Click.on(openCartData.CHECK_DEFAULT),
                Click.on(openCartData.BOTON_ADDRESS),*/
                Click.on(openCartData.BOTON_SAVE)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

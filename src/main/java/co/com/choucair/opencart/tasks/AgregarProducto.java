package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.models.ProductoOpenCart;
import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class AgregarProducto implements Task {

    List<ProductoOpenCart> productoOpenCarts;

    public AgregarProducto(List<ProductoOpenCart> productoOpenCarts) {
        this.productoOpenCarts = productoOpenCarts;
    }

    public static AgregarProducto aLaOrden(List<ProductoOpenCart> productoOpenCarts) {
        return Tasks.instrumented(AgregarProducto.class,productoOpenCarts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OpenCartData.AGREGAR_PEDIDO),
                Click.on(OpenCartData.NOMBRE_PEDIDO),
                Click.on(OpenCartData.ESCOGER_PEDIDO),
                Click.on(OpenCartData.OPCION_COLOR),
                Click.on(OpenCartData.COLOR),
                Click.on(OpenCartData.SAVE)
        );

    }
}

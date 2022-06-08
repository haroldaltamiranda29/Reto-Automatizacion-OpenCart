package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.models.LoginOpenCart;
import co.com.choucair.opencart.userinterface.OpenCartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
    private OpenCartData openCartData;

    List<LoginOpenCart> loginOpenCarts;

    public Login(List<LoginOpenCart> loginOpenCarts) {
        this.loginOpenCarts = loginOpenCarts;
    }

    public static Login onThePage(List<LoginOpenCart> loginOpenCarts) {
        return Tasks.instrumented(Login.class, loginOpenCarts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginOpenCarts.get(0).getUsuario()).into(openCartData.CAMPO_USUARIO),
                Enter.theValue(loginOpenCarts.get(0).getClave()).into(openCartData.CAMPO_CONTRASENA),
                Click.on(openCartData.BOTON_LOGIN)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Click.on(openCartData.BOTON_X)
        );

    }
}

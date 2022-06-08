package co.com.choucair.opencart.stepdefinitions;

import co.com.choucair.opencart.models.CustomersOpenCart;
import co.com.choucair.opencart.models.FiltroOpenCart;
import co.com.choucair.opencart.models.LoginOpenCart;
import co.com.choucair.opencart.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class OpenCartStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que estoy en la pagina opencart e inicio sesion con usuario y clave$")
    public void queEstoyEnLaPaginaOpencartEInicioSesionConUsuarioYClave(List<LoginOpenCart> loginOpenCarts) {
        OnStage.theActorCalled("Harold").attemptsTo(OpenUp.thePage(), (Login.onThePage(loginOpenCarts)));
    }

    @Y("^selecciono la opcion customers de la categoria customers y click en el boton add new$")
    public void seleccionoLaOpcionCustomersDeLaCategoriaCustomersYClickEnElBotonAddNew() {
        OnStage.theActorInTheSpotlight().attemptsTo(Customers.customers());
    }

    @Cuando("^lleno los formularios con la informacion del cliente y doy click en en boton save$")
    public void llenoLosFormulariosConLaInformacionDelClienteYDoyClickEnEnBotonSave(List<CustomersOpenCart> customersOpenCarts) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.formularios(customersOpenCarts));
    }

    @Entonces("^deberia visualizar el siguiente mensaje \"([^\"]*)\"$")
    public void deberiaVisualizarElSiguienteMensaje(String arg1) {
    }

    @Y("^selecciono la opcion pedidos de la categoria ventas$")
    public void seleccionoLaOpcionPedidosDeLaCategoriaVentas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ventas.pedidos());
    }

    @Cuando("^aplico el filtro para el pedido con su orderID y Customer$")
    public void aplicoElFiltroParaElPedidoConSuOrderIDYCustomer(List<FiltroOpenCart> filtroOpenCarts) {
        OnStage.theActorInTheSpotlight().attemptsTo(Filtro.datos(filtroOpenCarts));
    }

    @Entonces("^deberia visualizar el pedido con orderID \"([^\"]*)\" store \"([^\"]*)\" y customer \"([^\"]*)\"$")
    public void deberiaVisualizarElPedidoConOrderIDStoreYCustomer(String texto1, String texto2, String texto3) {
    }

    @Y("^selecciono ver una orden de los ultimos pedidos$")
    public void seleccionoVerUnaOrdenDeLosUltimosPedidos() {
    }

    @Cuando("^agrego un producto a la orden con su informacion$")
    public void agregoUnProductoALaOrdenConSuInformacion() {
    }

    @Entonces("^se valida que se modifique el carito de compra con el siguiente mensaje \"([^\"]*)\"$")
    public void seValidaQueSeModifiqueElCaritoDeCompraConElSiguienteMensaje(String arg1) {
    }
}

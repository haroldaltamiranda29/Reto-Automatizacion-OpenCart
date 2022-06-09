package co.com.choucair.opencart.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCartData {


    // CAMPOS MAPEADOS PARA ANTECEDENTES
    public static final Target CAMPO_USUARIO = Target.the("Caja de texto de usuario")
            .located(By.id("input-username"));
    public static final Target CAMPO_CONTRASENA = Target.the("Caja de texto de contraseña")
            .located(By.id("input-password"));
    public static final Target BOTON_LOGIN = Target.the("Boton login")
            .located(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
    public static final Target BOTON_X = Target.the("Boton X de la pagina de inicio")
            .located(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button"));


    //CAMPOS MAPEADOS PARA EL PRIMER CASO DE PRUEBA
    public static final Target BOTON_CUSTOMERS = Target.the("Seleccionar la cateoria Customers")
            .located(By.xpath("//*[@id=\"menu-customer\"]/a"));
    public static final Target SELECCION_CUSTOMERS = Target.the("Selecciona customers de la lista desplegable")
            .located(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a"));
    public static final Target BOTON_ADD_NEW = Target.the("Boton agregar nuevo")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a"));
    public static final Target CAMPO_FIRST_NAME = Target.the("Caja de texto primer nombre")
            .located(By.id("input-firstname"));
    public static final Target CAMPO_LAST_NAME = Target.the("Caja de texto apellido")
            .located(By.id("input-lastname"));
    public static final Target CAMPO_EMAIL = Target.the("Caja de texto del email")
            .located(By.id("input-email"));
    public static final Target CAMPO_PASSWORD = Target.the("Caja de texto de la contraseña")
            .located(By.id("input-password"));
    public static final Target CAMPO_CONFIRM = Target.the("Caja de texto confirmar contraseña")
            .located(By.id("input-confirm"));
    public static final Target OPCION_ADDRESSES = Target.the("Opcion direcciones")
            .located(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/a"));
    public static final Target BOTON_ADD_ADDRESSES = Target.the("Boton agregar direccion")
            .located(By.id("button-address"));
    public static final Target CAMPO_FIRST_NAME_ADDRESSES = Target.the("Caja de texto primer nombre de la direccion")
            .located(By.id("input-address-0-firstname"));
    public static final Target CAMPO_LAST_NAME_ADDRESSES = Target.the("Caja de texto del apellido de la direccion")
            .located(By.id("input-address-0-lastname"));
    public static final Target CAMPO_ADD_ADDRESSES = Target.the("Caja de texto de la direccion")
            .located(By.id("input-address-0-address-1"));
    public static final Target CAMPO_CITY_ADDRESSES = Target.the("Caja de texto de la ciudad de la direccion")
            .located(By.id("input-address-0-city"));
    public static final Target OPCION_COUNTRY = Target.the("Abre la lista desplegable de los paises")
            .located(By.id("input-address-0-country"));
    public static final Target SELECCIONAR_COUNTRY = Target.the("Selecciona el pais")
            .located(By.xpath("//*[@id=\"input-address-0-country\"]/option[52]"));
    public static final Target OPCION_REGION = Target.the("Abre la lista desplegable de las regiones")
            .located(By.id("input-address-0-zone"));
    public static final Target SELECCIONAR_REGION = Target.the("Selecciona la region")
            .located(By.xpath("//*[@id=\"input-address-0-zone\"]/option[3]"));
    public static final Target CHECK_DEFAULT = Target.the("Selecciona el check default")
            .located(By.id("input-address-0-default"));
    public static final Target BOTON_ADDRESS = Target.the("Boton agregar direccion")
            .located(By.id("button-address"));
    public static final Target BOTON_SAVE = Target.the("Boton guardar")
            .located(By.xpath("/html/body/div/div[2]/div[1]/div/div/button"));
    public static final Target MENSAJE1 = Target.the("Mensaje de alerta")
            .located(By.xpath("//*[@id=\"alert\"]/div"));

    //CAMPOS MAPEADOS PARA EL SEGUNDO CASO DE PRUEBA
    public static final Target BOTON_SALES = Target.the("Lista desplegable de sales")
            .located(By.xpath("//*[@id=\"menu-sale\"]/a"));
    public static final Target OPCION_ORDERS = Target.the("Selecciona categoria order")
            .located(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a"));
    public static final Target ORDER_ID = Target.the("Caja de texto orderId")
            .located(By.id("input-order-id"));
    public static final Target CUSTOMER = Target.the("Caja de texto curtomer")
            .located(By.id("input-customer"));
    public static final Target BOTON_FILTRO = Target.the("Boton filtro")
            .located(By.id("button-filter"));
    public static final Target TEXT_ORDER_ID = Target.the("Texto orderId")
            .located(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr/td[2]"));
    public static final Target TEXT_YOUR_STORE = Target.the("Texto your store")
            .located(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody/tr/td[4]"));
    public static final Target TEXT_CUSTOMER = Target.the("Texto curtomer")
            .located(By.id("//*[@id=\"form-order\"]/div[1]/table/tbody/tr/td[4]"));

    //CAMPOS MAPEADOS PARA EL TERCER CASO DE PRUEBA
    public static final Target VER_PEDIDO = Target.the("Ver pedido")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[6]/a/i"));
    public static final Target AGREGAR_PEDIDO = Target.the("Agregar pedido")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[2]/table[1]/tfoot/tr/td[2]/button"));
    public static final Target NOMBRE_PEDIDO = Target.the("Ver pedido")
            .located(By.id("input-product"));
    public static final Target ESCOGER_PEDIDO = Target.the("Escoger pedido")
            .located(By.xpath("//*[@id=\"list-product\"]/option[2]"));
    public static final Target OPCION_COLOR = Target.the("Opcion color")
            .located(By.id("input-option-226"));
    public static final Target COLOR = Target.the("Escoger pedido")
            .located(By.xpath("//*[@id=\"input-option-226\"]/option[2]"));
    public static final Target SAVE = Target.the("Guardar producto")
            .located(By.id("button-product-add"));
    public static final Target MENSAJE2 = Target.the("Mensaje de respuesta")
            .located(By.xpath("//*[@id=\"form-product-add\"]/div[1]"));
}

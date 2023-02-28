package org.tevolvers.web.Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderPage {

    public static final Target LBL_PHONE_CATEGORY = Target.the("Seleccionamos la categoria celulares").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
    public static final Target LBL_COMPUTER_CATEGORY = Target.the("Seleccionamos la categoria Computadores").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
    public static final Target LBL_MONITORS_CATEGORY = Target.the("Seleccionamos la categoria Monitores").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
    public static final Target lBL_SELECT_PRODUCT = Target.the("Seleccionamos un producto de la categoria").locatedBy("//*[@id='tbodyid']//div/div/h4/*[contains(text(),'{0}')]");
    public static final Target BTN_ADD_CAR = Target.the("boton para agregar productos al carrito").locatedBy("/html/body/div[5]/div/div[2]/div[2]/div/a");
    public static final Target BTN_GO_TO_CAR = Target.the("opcion para seleccionar carrito con los productos").located(By.id("cartur"));
    public static final Target BTN_MAKE_ORDER = Target.the("boton para realizar pedido").locatedBy("/html/body/div[6]/div/div[2]/button");
    public static final Target INPUT_NAME = Target.the("Campo Nombre").located(By.id("name"));
    public static final Target INPUT_COUNTRY = Target.the("Campo Pais").located(By.id("country"));
    public static final Target INPUT_CITY = Target.the("Campo Ciudad").located(By.id("city"));
    public static final Target INPUT_CREDIT_CARD = Target.the("Campo Tarjeta de credito").located(By.id("card"));
    public static final Target INPUT_YEAR = Target.the("Campo Año").located(By.id("month"));
    public static final Target INPUT_MONTH = Target.the("Campo Mes").located(By.id("year"));
    public static final Target BTN_MAIN_STORE = Target.the("Inicio de la tienda").located(By.id("nava"));
    public static final Target BTN_BUY = Target.the("boton para finalizar la compra de pedido").locatedBy("/html/body/div[3]/div/div/div[3]/button[2]");
    public static final Target LBL_SUCCESS_BUY = Target.the("modal que muestra el mensaje si la compra fue exitosa").locatedBy("/html/body/div[10]/h2");
    public static final Target LBL_PRODUCT_PRICE = Target.the("Valor Total de los productos").located(By.id("totalp"));
    public static final Target LBL_UNIT_PRICE = Target.the("Valor Unitario de los productos").locatedBy("/html/body/div[6]/div/div[1]/div/table/tbody/tr[{0}]/td[3]");
}

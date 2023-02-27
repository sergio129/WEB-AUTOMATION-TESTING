package org.tevolvers.web.Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PedidoPage {
    public static final Target Categoria_Celulares = Target.the("Seleccionamos la categoria celulares").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
    public static final Target Categoria_Computadores = Target.the("Seleccionamos la categoria Computadores").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));

    public static final Target Categoria_Monitores = Target.the("Seleccionamos la categoria Monitores").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));

    public static final Target Seleccionar_Producto = Target.the("Seleccionamos un producto de la categoria").locatedBy("//*[@id='tbodyid']//div/div/h4/*[contains(text(),'{0}')]");

    public static final Target Boton_Agregar_Carrito = Target.the("boton para agregar productos al carrito").locatedBy("/html/body/div[5]/div/div[2]/div[2]/div/a");
    public static final Target Opcion_ir_al_Carrito = Target.the("opcion para seleccionar carrito con los productos").located(By.id("cartur"));

    public static final Target Boton_Realizar_Pedido = Target.the("boton para realizar pedido").locatedBy("/html/body/div[6]/div/div[2]/button");

    public static final Target Campo_Nombre = Target.the("Campo Nombre").located(By.id("name"));
    public static final Target Campo_Pais = Target.the("Campo Pais").located(By.id("country"));

    public static final Target Campo_Ciudad = Target.the("Campo Ciudad").located(By.id("city"));

    public static final Target Campo_Tarje_Credito = Target.the("Campo Tarjeta de credito").located(By.id("card"));
    public static final Target Campo_Ano = Target.the("Campo Año").located(By.id("month"));

    public static final Target Campo_Mes = Target.the("Campo Mes").located(By.id("year"));

    public static final Target Porduct_Store = Target.the("Inicio de la tienda").located(By.id("nava"));
    public static final Target Boton_Comprar = Target.the("boton para finalizar la compra de pedido").locatedBy("/html/body/div[3]/div/div/div[3]/button[2]");

    public static final Target Modal_compra_Exitosa = Target.the("modal que muestra el mensaje si la compra fue exitosa").locatedBy("/html/body/div[10]/h2");




}

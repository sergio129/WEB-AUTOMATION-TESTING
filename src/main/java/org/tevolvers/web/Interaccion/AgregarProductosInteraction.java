package org.tevolvers.web.Interaccion;

import lombok.AllArgsConstructor;
import lombok.var;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tevolvers.web.Model.ProductosModel;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.tevolvers.web.Interfaces.PedidoPage.*;

@AllArgsConstructor
public class AgregarProductosInteraction implements Interaction {

    private final ProductosModel productos;


    public static AgregarProductosInteraction DatosCompra(ProductosModel productos) {
        return new AgregarProductosInteraction(productos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Categoria_Celulares),
                Click.on(Seleccionar_Producto.of(String.valueOf(productos.getPhones())))
        );
        actor.attemptsTo(Click.on(Boton_Agregar_Carrito));


        final var alert = new WebDriverWait(getDriver(), Duration.ofMillis(100))
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();

        actor.attemptsTo(Click.on(Porduct_Store),
                Click.on(Categoria_Computadores),
                Click.on(Seleccionar_Producto.of(String.valueOf(productos.getLaptops()))));

        actor.attemptsTo(Click.on(Boton_Agregar_Carrito));
        alert.accept();
        actor.attemptsTo(Click.on(Porduct_Store),
                Click.on(Categoria_Monitores),
                Click.on(Seleccionar_Producto.of(String.valueOf(productos.getMonitors()))), Click.on(Boton_Agregar_Carrito));
        actor.attemptsTo(
                Click.on(Porduct_Store),
                Click.on(Opcion_ir_al_Carrito));


        for (int i = 1; i <= 3; i++) {
            int suma;
            suma = Integer.parseInt(Valor_Unitario.of(String.valueOf(i)).resolveFor(actor).getText());
            int sumar=suma++;
            System.out.println("Suma de los total Productos es = " + sumar);

        }
        System.out.println("Pruebas Manual");
        int Valor = Integer.parseInt(Valor_Unitario.of(String.valueOf(1)).resolveFor(actor).getText());
        System.out.println("Valor unitario del producto:" + Valor);
        int Valordos = Integer.parseInt(Valor_Unitario.of(String.valueOf(2)).resolveFor(actor).getText());
        System.out.println("Valor unitario del producto:" + Valordos);
        int Valortes = Integer.parseInt(Valor_Unitario.of(String.valueOf(3)).resolveFor(actor).getText());
        System.out.println("Valor unitario del producto:" + Valortes);
        int suma = Valor + Valordos + Valortes;
        System.out.println("Suma Total de los productos :" + suma);
        actor.attemptsTo(Ensure.that(Valor_total).text().isEqualTo(String.valueOf(suma)));

        actor.attemptsTo(Click.on(Boton_Realizar_Pedido));

    }
}


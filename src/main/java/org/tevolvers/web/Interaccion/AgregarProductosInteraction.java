package org.tevolvers.web.Interaccion;

import lombok.AllArgsConstructor;
import lombok.var;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tevolvers.web.Model.ProductosModel;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
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
                Click.on(Seleccionar_Producto.of(String.valueOf(productos.getLaptops()))), (Click.on(Boton_Agregar_Carrito)));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
        actor.attemptsTo(Click.on(Porduct_Store),
                Click.on(Categoria_Monitores),
                Click.on(Seleccionar_Producto.of(String.valueOf(productos.getMonitors()))), Click.on(Boton_Agregar_Carrito));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
        actor.attemptsTo(
                Click.on(Porduct_Store),
                Click.on(Opcion_ir_al_Carrito));

        actor.attemptsTo(ValorTotalInteration.datos());
        actor.attemptsTo(Click.on(Boton_Realizar_Pedido));

    }
}


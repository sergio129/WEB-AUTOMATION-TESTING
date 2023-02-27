package org.tevolvers.web.Tareas;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.tevolvers.web.Interaccion.AgregarProductosInteraction;
import org.tevolvers.web.Model.ProductosModel;

@AllArgsConstructor
public class AgregarProductosTask implements Task {

    private final  ProductosModel productos;
    public static AgregarProductosTask datosPedido(ProductosModel productos){
        return new AgregarProductosTask(productos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                AgregarProductosInteraction.DatosCompra(productos)
        );
    }
}

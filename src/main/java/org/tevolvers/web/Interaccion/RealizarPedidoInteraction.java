package org.tevolvers.web.Interaccion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.tevolvers.web.Model.PedidoModel;

import static org.tevolvers.web.Interfaces.PedidoPage.*;

@AllArgsConstructor
public class RealizarPedidoInteraction implements Interaction {
    private final PedidoModel pedido;
    public static RealizarPedidoInteraction datosPedido(PedidoModel pedido){
        return new RealizarPedidoInteraction(pedido);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(pedido.getNombre()).into(Campo_Nombre),
                Enter.theValue(pedido.getPais()).into(Campo_Pais),
                Enter.theValue(pedido.getCiudad()).into(Campo_Ciudad),
                Enter.theValue(pedido.getTarjetaCredito()).into(Campo_Tarje_Credito),
                Enter.theValue(pedido.getYear()).into(Campo_Ano),
                Enter.theValue(pedido.getMes()).into(Campo_Mes),
                Click.on(Boton_Comprar)
        );

    }
}

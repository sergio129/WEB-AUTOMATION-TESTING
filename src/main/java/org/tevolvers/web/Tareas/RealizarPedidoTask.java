package org.tevolvers.web.Tareas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.tevolvers.web.Interaccion.RealizarPedidoInteraction;
import org.tevolvers.web.Model.PedidoModel;
@AllArgsConstructor
public class RealizarPedidoTask implements Task {
    private final PedidoModel pedido;
    public static RealizarPedidoTask datospedido(PedidoModel pedido){
        return new RealizarPedidoTask(pedido);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(RealizarPedidoInteraction.datosPedido(pedido));
    }
}

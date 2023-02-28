package org.tevolvers.web.Tareas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.tevolvers.web.Interaccion.MakeOrderInteraction;
import org.tevolvers.web.Model.OrderModel;

@AllArgsConstructor
public class MakeOrderTask implements Task {
    private final OrderModel dataOrder;

    public static MakeOrderTask forBuy(OrderModel dataOrder) {
        return new MakeOrderTask(dataOrder);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MakeOrderInteraction.forBuy(dataOrder));
    }
}

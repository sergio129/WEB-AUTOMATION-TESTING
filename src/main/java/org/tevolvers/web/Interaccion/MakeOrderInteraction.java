package org.tevolvers.web.Interaccion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.tevolvers.web.Model.OrderModel;

import static org.tevolvers.web.Interfaces.OrderPage.*;

@AllArgsConstructor
public class MakeOrderInteraction implements Interaction {
    private final OrderModel dataOrder;

    public static MakeOrderInteraction forBuy(OrderModel dataOrder) {
        return new MakeOrderInteraction(dataOrder);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataOrder.getName()).into(INPUT_NAME),
                Enter.theValue(dataOrder.getCountry()).into(INPUT_COUNTRY),
                Enter.theValue(dataOrder.getCity()).into(INPUT_CITY),
                Enter.theValue(dataOrder.getCreditCard()).into(INPUT_CREDIT_CARD),
                Enter.theValue(dataOrder.getYear()).into(INPUT_YEAR),
                Enter.theValue(dataOrder.getMonth()).into(INPUT_MONTH),
                Click.on(BTN_BUY));
    }
}
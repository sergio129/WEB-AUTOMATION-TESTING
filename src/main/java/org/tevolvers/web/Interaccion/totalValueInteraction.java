package org.tevolvers.web.Interaccion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static net.serenitybdd.screenplay.ensure.Ensure.that;
import static org.tevolvers.web.Interfaces.PedidoPage.LBL_PRODUCT_PRICE;
import static org.tevolvers.web.Interfaces.PedidoPage.LBL_UNIT_PRICE;

public class totalValueInteraction implements Interaction {

    public static totalValueInteraction ofProducts() {
        return new totalValueInteraction();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int data;
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            data = parseInt(LBL_UNIT_PRICE.of(valueOf(i)).resolveFor(actor).getText());
            sum += data;
        }
        actor.attemptsTo(that(LBL_PRODUCT_PRICE).text().isEqualTo(valueOf(sum)));
    }
}
package org.tevolvers.web.Interaccion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.ensure.Ensure;

import static org.tevolvers.web.Interfaces.PedidoPage.Valor_Unitario;
import static org.tevolvers.web.Interfaces.PedidoPage.Valor_total;

public class ValorTotalInteration implements Interaction {
    public static ValorTotalInteration datos(){
        return new ValorTotalInteration();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int datos;
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            datos = Integer.parseInt(Valor_Unitario.of(String.valueOf(i)).resolveFor(actor).getText());
            sum += datos;
        }
        actor.attemptsTo(Ensure.that(Valor_total).text().isEqualTo(String.valueOf(sum)));

    }
}

package org.tevolvers.web.Question;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static org.tevolvers.web.Interfaces.PedidoPage.LBL_SUCCESS_BUY;

@AllArgsConstructor
public class PedidosQuestions implements Question<Boolean> {
    private String model;

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_SUCCESS_BUY.of(String.valueOf(model)).resolveFor(actor).isVisible();
    }

    public static PedidosQuestions isVisible(String model) {
        return new PedidosQuestions(model);
    }
}

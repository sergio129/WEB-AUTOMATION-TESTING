package org.tevolvers.web.Interaccion;

import lombok.AllArgsConstructor;
import lombok.var;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tevolvers.web.Model.ProductsModel;

import java.time.Duration;

import static java.lang.String.valueOf;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.tevolvers.web.Interfaces.PedidoPage.*;

@AllArgsConstructor
public class AddProductInteraction implements Interaction {

    private final ProductsModel products;

    public static AddProductInteraction inBuy(ProductsModel products) {
        return new AddProductInteraction(products);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_PHONE_CATEGORY),
                Click.on(lBL_SELECT_PRODUCT.of(valueOf(products.getPhones()))));
        actor.attemptsTo(Click.on(BTN_ADD_CAR));

        final var alert = new WebDriverWait(getDriver(), Duration.ofMillis(100))
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();

        actor.attemptsTo(
                Click.on(BTN_MAIN_STORE),
                Click.on(LBL_COMPUTER_CATEGORY),
                Click.on(lBL_SELECT_PRODUCT.of(valueOf(products.getLaptops()))),
                (Click.on(BTN_ADD_CAR)));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
        actor.attemptsTo(Click.on(BTN_MAIN_STORE),
                Click.on(LBL_MONITORS_CATEGORY),
                Click.on(lBL_SELECT_PRODUCT.of(valueOf(products.getMonitors()))),
                Click.on(BTN_ADD_CAR));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
        actor.attemptsTo(
                Click.on(BTN_MAIN_STORE),
                Click.on(BTN_GO_TO_CAR));

        actor.attemptsTo(totalValueInteraction.ofProducts());
        actor.attemptsTo(Click.on(BTN_MAKE_ORDER));

    }
}


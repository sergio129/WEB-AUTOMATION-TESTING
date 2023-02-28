package org.tevolvers.web.Tareas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.tevolvers.web.Interaccion.AddProductInteraction;
import org.tevolvers.web.Model.ProductsModel;

@AllArgsConstructor
public class addProductTask implements Task {

    private final ProductsModel products;

    public static addProductTask dataBuy(ProductsModel products) {
        return new addProductTask(products);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                AddProductInteraction.inBuy(products));
    }
}
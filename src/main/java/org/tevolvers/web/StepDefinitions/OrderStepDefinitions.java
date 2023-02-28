package org.tevolvers.web.StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.tevolvers.web.Interfaces.UrlPage;
import org.tevolvers.web.Model.OrderModel;
import org.tevolvers.web.Model.ProductsModel;
import org.tevolvers.web.Tareas.MakeOrderTask;
import org.tevolvers.web.Tareas.TotalValueSum;
import org.tevolvers.web.Tareas.addProductTask;
import org.tevolvers.web.Utilidades.DataOrder;

import static net.serenitybdd.screenplay.ensure.Ensure.that;
import static org.tevolvers.web.Interfaces.PedidoPage.LBL_SUCCESS_BUY;

public class OrderStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    UrlPage url = new UrlPage();
    private final Actor actor = Actor.named("Usuario");
    ProductsModel products = new ProductsModel();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("Sergio ingresa a la pagina de demoblaze")
    public void getIntoPage() {
        actor.wasAbleTo(Open.browserOn(url));
    }

    @When("^el ingresa el nombre de los productos para hacer la compra: (.*), (.*), (.*)$")
    public void sendProductName(String phone, String laptops, String monitors) {
        products.setPhones(phone);
        products.setLaptops(laptops);
        products.setMonitors(monitors);
        actor.attemptsTo(addProductTask.dataBuy(products));
    }

    @And("el escribe los datos para para realizar el pedido")
    public void writeDataForSendOrder() {
        OrderModel dataOrder = DataOrder.DataOrderModel();
        actor.attemptsTo(MakeOrderTask.forBuy(dataOrder));
    }

    @Then("el valida que la suma del valor de los productos sea igual al valor total")
    public void validateTotalSum() {
        actor.attemptsTo(TotalValueSum.ofBuy());
    }

    @And("el valida el mensaje de compra exitosa: {string}")
    public void validateSuccesfulTex(String text) {
        actor.attemptsTo(that(LBL_SUCCESS_BUY).text().isEqualTo(text));
    }
}

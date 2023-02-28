package org.tevolvers.web.StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.tevolvers.web.Interfaces.UrlPage;
import org.tevolvers.web.Model.PedidoModel;
import org.tevolvers.web.Model.ProductosModel;
import org.tevolvers.web.Tareas.AgregarProductosTask;
import org.tevolvers.web.Tareas.ValorTotalTask;
import org.tevolvers.web.Tareas.RealizarPedidoTask;
import org.tevolvers.web.Utilidades.DatosPedidos;

import static org.tevolvers.web.Interfaces.PedidoPage.*;

public class PedidoStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    UrlPage url = new UrlPage();
    private final Actor actor = Actor.named("Usuario");
    ProductosModel productos = new ProductosModel();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("Ingresamos pagina de demoblaze")
    public void Ingresamos_pagina_de_Advantageon_Line_Shopping() {
        actor.wasAbleTo(Open.browserOn(url));
    }


    @When("^Ingreso el nombre de los productos para hacer la compra: (.*), (.*), (.*)$")
    public void ingresoElNombreDeLosProductosParaHacerLaCompraPhoneLaptopsMonitors(String phone, String laptops, String monitors) {
        productos.setPhones(phone);
        productos.setLaptops(laptops);
        productos.setMonitors(monitors);
        actor.attemptsTo(AgregarProductosTask.datosPedido(productos));

    }

    @And("Escribo los datos para para realizar el pedido")
    public void escriboLosDatosParaParaRealizarElPedido() {
        PedidoModel datos = DatosPedidos.DatosPedidomodel();
        actor.attemptsTo(RealizarPedidoTask.datospedido(datos));
    }

    @Then("Validamos mensaje de compra exitosa: {string}")
    public void validamosMensajeDeRegistroExitoso(String arg0) {
        actor.attemptsTo(
                Ensure.that(Modal_compra_Exitosa).text().isEqualTo(arg0)

        );

    }

    @And("Calculamos la suma del valor de los productos sea igual al valor total")
    public void calculamosLaSumaDelValorDeLosProductosSeaIgualAlValorTotal() {
        actor.attemptsTo(ValorTotalTask.datos());
    }
}

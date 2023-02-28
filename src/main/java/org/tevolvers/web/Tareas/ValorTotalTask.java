package org.tevolvers.web.Tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.tevolvers.web.Interaccion.ValorTotalInteration;

public class ValorTotalTask implements Task {
    public static ValorTotalTask datos(){
        return new ValorTotalTask();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        ValorTotalInteration.datos());
    }
}

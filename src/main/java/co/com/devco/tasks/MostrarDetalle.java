package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetBookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MostrarDetalle implements Task {


    public MostrarDetalle() {
    }

    public static Performable abrir() {
        return instrumented(MostrarDetalle.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(RESULTADO)
        );
    }
}

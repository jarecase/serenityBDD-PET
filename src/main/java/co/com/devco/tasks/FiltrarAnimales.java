package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.PetBookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarAnimales implements Task {
    private String opcionFiltro;


    public FiltrarAnimales(String opcionFiltro) {
        this.opcionFiltro = opcionFiltro;
    }

    public static Performable filtro(String opcionFiltro) {
        return instrumented(FiltrarAnimales.class, opcionFiltro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(RetornarBotonFiltro(opcionFiltro))
        );
    }
}

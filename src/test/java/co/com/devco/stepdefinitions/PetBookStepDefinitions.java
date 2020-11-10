package co.com.devco.stepdefinitions;

import co.com.devco.tasks.FiltrarAnimales;
import co.com.devco.tasks.MostrarDetalle;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.PetBookDetallePage.FOTO_DETALLE;
import static co.com.devco.userinterfaces.PetBookHomePage.RESULTADO_FILTRO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PetBookStepDefinitions {


    @Cuando("^\"(.*)\" le da en la opcion de \"(.*)\"")
    public void marcela_le_da_en_la_opcion_de_perro(String actorName, String opcionFiltro) {
        theActorCalled(actorName).attemptsTo(
                FiltrarAnimales.filtro(opcionFiltro)
        );
    }

    @Entonces("solo debe mostrar los resultados de los \"(.*)\"")
    public void solo_debe_mostrar_los_resultados_de_un_tipo_de_animal() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADO_FILTRO).values().hasSizeGreaterThan(1)
        );
    }

    @Entonces("debe mostrar {int} numero de registros")
    public void debe_mostrar_x_numero_de_registros(Integer numeroRegistros) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADO_FILTRO).values().hasSize(numeroRegistros)
        );
    }
    @Cuando("^\"(.*)\" le da en la click en una foto de animal")
    public void le_da_en_la_click_en_una_foto_de_animal(String actorName) {
        theActorCalled(actorName).attemptsTo(
                MostrarDetalle.abrir()
        );
    }

    @Entonces("debe mostrar el detalle del animal")
    public void debe_mostrar_el_detalle_del_animal() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(FOTO_DETALLE).isDisplayed()
        );
    }
}

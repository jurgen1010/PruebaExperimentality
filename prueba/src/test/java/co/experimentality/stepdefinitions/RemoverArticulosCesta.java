package co.experimentality.stepdefinitions;

import co.experimentality.questions.RemoverItemCesta;
import co.experimentality.tasks.RemoverArticulo;
import co.experimentality.tasks.SeleccionarArticulo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.experimentality.utils.ConstantesRemoverArticulos.MENSAJE_CONFIRMA_ELIMINACION_ESPERADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class RemoverArticulosCesta {

    @Cuando("^remuevo de la cesta de compras un articulo$")
    public void remuevoDeLaCestaDeComprasUnArticulo() {
        theActorInTheSpotlight().attemptsTo(SeleccionarArticulo.agregarACesta());
        theActorInTheSpotlight().attemptsTo(RemoverArticulo.enCestaDeCompras());
    }

    @Entonces("^se visualizara una alerta confirmando la eliminacion del articulo$")
    public void seVisualizaraUnaAlertaConfirmandoLaEliminacionDelArticulo() {
        theActorInTheSpotlight().should(seeThat(RemoverItemCesta.enCestaCompra(), equalTo(MENSAJE_CONFIRMA_ELIMINACION_ESPERADO)));
    }


}

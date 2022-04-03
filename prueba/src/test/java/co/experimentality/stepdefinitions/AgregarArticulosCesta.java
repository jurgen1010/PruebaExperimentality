package co.experimentality.stepdefinitions;

import co.experimentality.questions.CestaDeCompras;
import co.experimentality.tasks.IngresarACategoria;
import co.experimentality.tasks.SeleccionarArticulo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class AgregarArticulosCesta {
    @Dado("^que el usuario se encuentra en el portal clothesstore-latam dentro la categoria (.*)$")
    public void queElUsuarioSeEncuentraEnElPortalClothesstoreLatamDentroLaCategoriaHombre(String nombreCategoria) {
        theActorInTheSpotlight().attemptsTo(IngresarACategoria.conNombre(nombreCategoria));
    }

    @Cuando("^el agrega a la cesta de compras un articulo$")
    public void elAgregaALaCestaDeComprasUnArticulo() {
        theActorInTheSpotlight().attemptsTo(SeleccionarArticulo.agregarACesta());
    }

    @Entonces("^el podra visualizar el articulo selecionado dentro de la cesta$")
    public void elPodraVisualizarElArticuloSelecionadoDentroDeLaCesta() {
        String productoAgregado = theActorInTheSpotlight().recall("productName");
        theActorInTheSpotlight().should(seeThat(CestaDeCompras.conProductoSeleccionado(), equalTo("1 x ".concat(productoAgregado))));
    }
}

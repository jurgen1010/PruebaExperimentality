package co.experimentality.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.experimentality.userinterfaces.AgregarACesta.*;
import static co.experimentality.utils.GenerarIndex.generarNumeroEnteroAleatorio;

public class AgregarACesta implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String indexAleatorio = generarNumeroEnteroAleatorio();

        actor.attemptsTo(Scroll.to(TARJETA_PRODUCTO.of(indexAleatorio)));
        actor.attemptsTo(Click.on(BOTON_AGREGAR_A_CESTA_DE_COMPRAS.of(indexAleatorio)));

        String product = NOMBRE_ARTICULO.of(indexAleatorio).resolveFor(actor).getText();

        actor.remember("productName", product);

        actor.attemptsTo(Click.on(ICONO_CESTA_DE_COMPRAS));
    }

    public static AgregarACesta productoDeLaCategoria(){
        return Tasks.instrumented(AgregarACesta.class);
    }
}

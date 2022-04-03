package co.experimentality.tasks;

import co.experimentality.interactions.AgregarACesta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarArticulo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AgregarACesta.productoDeLaCategoria());
    }

    public static SeleccionarArticulo agregarACesta(){
        return Tasks.instrumented(SeleccionarArticulo.class);
    }
}

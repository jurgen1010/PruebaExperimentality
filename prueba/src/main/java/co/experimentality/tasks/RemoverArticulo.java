package co.experimentality.tasks;

import co.experimentality.interactions.ModificarCesta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RemoverArticulo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ModificarCesta.removerArticulo());
    }

    public static RemoverArticulo enCestaDeCompras(){
        return Tasks.instrumented(RemoverArticulo.class);
    }
}

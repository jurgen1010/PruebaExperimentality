package co.experimentality.tasks;

import co.experimentality.interactions.AgregarACesta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.experimentality.userinterfaces.AgregarACesta.CATEGORIA;

public class IngresarACategoria implements Task {

    private String nombreCategoria;

    public IngresarACategoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CATEGORIA.of(nombreCategoria)));

    }

    public static IngresarACategoria conNombre(String nombreCategoria){
        return Tasks.instrumented(IngresarACategoria.class, nombreCategoria);
    }
}

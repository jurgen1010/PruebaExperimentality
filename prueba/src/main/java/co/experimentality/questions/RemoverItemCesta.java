package co.experimentality.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.experimentality.userinterfaces.RemoverArticulo.MENSAJE_CONFIRMACION_ELIMINACION;

public class RemoverItemCesta implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_CONFIRMACION_ELIMINACION).viewedBy(actor).asString();
    }

    public static RemoverItemCesta enCestaCompra(){
        return new RemoverItemCesta();
    }
}

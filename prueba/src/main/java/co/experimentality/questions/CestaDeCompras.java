package co.experimentality.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.experimentality.userinterfaces.AgregarACesta.NOMBRE_ARTICULO_EN_CESTA_DE_COMPRAS;

public class CestaDeCompras implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(NOMBRE_ARTICULO_EN_CESTA_DE_COMPRAS).viewedBy(actor).asString();
    }

    public static CestaDeCompras conProductoSeleccionado(){
        return new CestaDeCompras();
    }
}

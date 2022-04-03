package co.experimentality.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RemoverArticulo {

    public static final Target BOTON_REMOVER_ARTICULO = Target.the("Boton remover articulo").locatedBy("//strong[contains(text(),'{0}')]//span[@class='item-quantity']//ancestor::div[3]/child::div[5]/button");
    public static final Target MENSAJE_CONFIRMACION_ELIMINACION = Target.the("Confirmacion de eliminacion de articulo en cesta de compra").locatedBy("//h2[@id='swal2-title']");
}

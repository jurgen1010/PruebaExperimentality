package co.experimentality.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarACesta {

    public static final Target CATEGORIA = Target.the("Secciones de ropa").locatedBy("//div[@class='navbar-mode']/span[contains(text(),'{0}')]");
    public static final Target TARJETA_PRODUCTO = Target.the("Tarjeta de producto").locatedBy("//body//app-root//app-product-card[{0}]");
    public static final Target BOTON_AGREGAR_A_CESTA_DE_COMPRAS = Target.the("Boton agregar articulo a cesta de compras").locatedBy("(//button[contains(text(),'Add to Cart')])[{0}]");
    public static final Target ICONO_CESTA_DE_COMPRAS = Target.the("Icono cesta de compras").locatedBy("//img[@id='cart-icon']");
    public static final Target NOMBRE_ARTICULO = Target.the("Nombre articulo").locatedBy("//app-product-card[{0}]//div[1]//div[1]//a[1]");
    public static final Target NOMBRE_ARTICULO_EN_CESTA_DE_COMPRAS = Target.the("Nombre articulo dentro de cesta de compras").locatedBy("//body//app-root//strong[1]");
}

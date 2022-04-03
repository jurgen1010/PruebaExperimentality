package co.experimentality.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import static co.experimentality.userinterfaces.RemoverArticulo.BOTON_REMOVER_ARTICULO;

public class ModificarCesta implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String productoAgregado = actor.recall("productName");

        actor.attemptsTo(Click.on(BOTON_REMOVER_ARTICULO.of(productoAgregado)));

        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window

        WebElement botonAceptar = driver.findElement(By.xpath("//button[contains(text(),'eliminar')]"));
        botonAceptar.click();

        WebElement mensajeConfirmacion = driver.findElement(By.xpath("//h2[@id='swal2-title']"));
        actor.remember("mensajeConfirmaItemEliminado", mensajeConfirmacion.getText());

        //driver.switchTo().window(parentWindowHandler);  // switch back to parent window

    }

    public static ModificarCesta removerArticulo(){
        return Tasks.instrumented(ModificarCesta.class);
    }
}

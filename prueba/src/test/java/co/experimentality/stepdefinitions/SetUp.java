package co.experimentality.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SetUp {
    @Managed
    public WebDriver browser;

    @Before
    public void setUp(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Usuario clothesstore");
        theActorInTheSpotlight().can(BrowseTheWeb.with(browser)).wasAbleTo(Open.url("https://jagoqui-clothesstore-latam.netlify.app/#/home"));
    }
}

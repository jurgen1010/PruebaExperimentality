package co.experimentality.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AgregarArticuloCestaCompras.feature",
        glue = "co.experimentality.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AgregarArticuloCestaCompras {
}

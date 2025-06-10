package co.sqasa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/test.feature"},
        glue = "co.sqasa.stepdefinition",
        tags = "@e2e",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DatePickerTest {
}

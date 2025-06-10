package co.sqasa.stepdefinition;

import co.sqasa.tasks.GoToPage;
import co.sqasa.tasks.SelectDate;
import co.sqasa.tasks.SelectNextDate;
import co.sqasa.tasks.TypeDate;
import co.sqasa.questions.SelectedDateMatches;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TestStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user has opened the jQuery Datepicker main page")
    public void userOpenedTheJqueryDatepickerMainPage() {
        OnStage.theActorCalled("Sebastian").attemptsTo(
                GoToPage.navigate()
        );
    }

    @When("the user selects the fifteenth day of the current month")
    public void userSelectsFifteenthDayOfCurrentMonth() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectDate.onDay15()
        );
    }

    @When("the user selects the tenth day of the next month")
    public void userSelectsTenthDayOfNextMonth() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectNextDate.onDay10()
        );
    }

    @When("the user types the date {string} into the text field")
    public void userTypesDateIntoTextField(String date) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TypeDate.withValue(date)
        );
    }

    @Then("the selected date should be {string}")
    public void theSelectedDateShouldBe(String expectedDate) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(SelectedDateMatches.to(expectedDate))
        );
    }
}
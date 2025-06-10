package co.sqasa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SelectedDateMatches implements Question<Boolean> {

    private final String expectedDate;

    public SelectedDateMatches(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String selectedDate = actor.recall("selected_date");
        return expectedDate.equals(selectedDate);
    }

    public static SelectedDateMatches to(String expectedDate) {
        return new SelectedDateMatches(expectedDate);
    }
}

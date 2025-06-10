package co.sqasa.tasks;

import co.sqasa.interactions.SwitchIframe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.userinterfaces.DatePicker.*;

public class TypeDate implements Task {

    private final String dateValue;

    public TypeDate(String dateValue) {
        this.dateValue = dateValue;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchIframe.to(DATEPICKER_IFRAME),
                Enter.theValue(dateValue).into(DATE_INPUT_FIELD)
        );

        String selectedDate = DATE_INPUT_FIELD.resolveFor(actor).getValue();
        actor.remember("selected_date", selectedDate);
    }

    public static TypeDate withValue(String dateValue) {
        return Tasks.instrumented(TypeDate.class, dateValue);
    }
}

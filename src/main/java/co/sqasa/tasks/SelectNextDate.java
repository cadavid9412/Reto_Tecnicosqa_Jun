package co.sqasa.tasks;

import co.sqasa.interactions.SwitchIframe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqasa.userinterfaces.DatePicker.*;

public class SelectNextDate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchIframe.to(DATEPICKER_IFRAME),
                Click.on(DATE_INPUT_FIELD),
                WaitUntil.the(DATEPICKER_TITLE_LABEL, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEXT_MONTH_BUTTON),
                WaitUntil.the(DAY_BUTTON_BY_DATE.of("10"), WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DAY_BUTTON_BY_DATE.of("10"))
        );

        String selectedDate = DATE_INPUT_FIELD.resolveFor(actor).getValue();
        actor.remember("selected_date", selectedDate);
    }

    public static SelectNextDate onDay10() {
        return Tasks.instrumented(SelectNextDate.class);
    }
}

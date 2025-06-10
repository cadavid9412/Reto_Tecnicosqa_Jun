package co.sqasa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class DatePicker extends PageObject{

    public static final Target DATEPICKER_IFRAME = Target.the("iframe containing the date picker widget")
            .located(By.className("demo-frame"));

    public static final Target DATE_INPUT_FIELD = Target.the("input field that opens the date picker")
            .located(By.id("datepicker"));

    public static final Target DATEPICKER_CONTAINER = Target.the("container div of the date picker")
            .located(By.id("ui-datepicker-div"));

    public static final Target DATEPICKER_TITLE_LABEL = Target.the("title label showing current month and year")
            .located(By.className("ui-datepicker-title"));

    public static final Target NEXT_MONTH_BUTTON = Target.the("button to go to the next month")
            .located(By.cssSelector("#ui-datepicker-div .ui-datepicker-next"));

    public static final Target PREVIOUS_MONTH_BUTTON = Target.the("button to go to the previous month")
            .located(By.cssSelector("#ui-datepicker-div .ui-datepicker-prev"));

    public static final Target DAY_BUTTON_BY_DATE = Target.the("specific day button {0} in the calendar")
            .locatedBy("//div[@id='ui-datepicker-div']//a[text()='{0}']");

    public static final Target SELECTED_DATE_VALUE = Target.the("value displayed in the input field after selection")
            .located(By.id("datepicker"));
}

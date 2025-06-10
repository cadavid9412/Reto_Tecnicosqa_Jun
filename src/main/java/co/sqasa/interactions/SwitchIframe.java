package co.sqasa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import java.util.Objects;

public class SwitchIframe {

    private SwitchIframe() {
    }

    public static Interaction to(Target iframeTarget) {
        return Tasks.instrumented(SwitchToIframe.class, iframeTarget);
    }

    public static Interaction toDefaultContent() {
        return Tasks.instrumented(SwitchToDefaultContent.class);
    }

    public static class SwitchToIframe implements Interaction {

        private final Target iframeTarget;

        public SwitchToIframe(Target iframeTarget) {
            this.iframeTarget = Objects.requireNonNull(iframeTarget, "iframeTarget cannot be null");
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            BrowseTheWeb.as(actor).getDriver()
                    .switchTo()
                    .frame(iframeTarget.resolveFor(actor));
        }
    }

    public static class SwitchToDefaultContent implements Interaction {

        @Override
        public <T extends Actor> void performAs(T actor) {
            BrowseTheWeb.as(actor).getDriver()
                    .switchTo()
                    .defaultContent();
        }
    }
}

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Search;
import questions.TheSearchResults;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class SampleTest {

    private Actor actor = Actor.named("actor");
    private WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void sampleTest() {
        givenThat(actor).wasAbleTo(Open.url("https://www.google.com"));
        when(actor).attemptsTo(Search.forTheTerm("Serenity BDD"));
        then(actor).should(seeThat(TheSearchResults.displayed(), containsString("Serenity BDD")));

        // Write your test here
    }
}
package pageObjects;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Search {

    public static Task forTheTerm(String term) {
        return Task.where("{0} searches for the term " + term,
                Enter.theValue(term).into(By.name("q"))
        );
    }
}

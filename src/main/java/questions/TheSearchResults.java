package questions;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.openqa.selenium.By;

public class TheSearchResults {

    public static Question<String> displayed() {
        return TextContent.of(By.id("result-stats"));
    }
}
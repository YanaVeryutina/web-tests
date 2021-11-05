import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    void selenideSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("Selenide")
                .pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));

    }

}
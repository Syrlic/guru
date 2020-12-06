import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GoogleTests {

    @Test
    void selenideSearchTest(){
        //open google
        open("https://google.com");
        //enter into search area
        $(byName("q")).setValue("Selenide").pressEnter();
        //verify that text displayed
        $("html").shouldHave(Condition.text("ru.selenide.org"));
    }
}

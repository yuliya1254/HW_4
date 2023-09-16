import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchExampleJU {

    @BeforeAll
     static void BeforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void SearchJUnit() {
        // 1 Откройте страницу Selenide в Github
        open("/selenide/selenide");
        // 2 Перейдите в раздел Wiki проекта
        // 3 Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // 4 Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5




    }




}

import org.junit.jupiter.api.BeforeAll;

public class SearchJUnit5 {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";

    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
    }


        // 1.Откройте страницу Selenide в Github
    // 2.Перейдите в раздел Wiki проекта
    // 3.Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
    // 4.Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
}

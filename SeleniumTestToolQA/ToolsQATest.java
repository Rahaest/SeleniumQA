package SeleniumTestToolQA;

import SeleniumTestToolQA.pages.ToolsQAFormsPage;
import SeleniumTestToolQA.pages.ToolsQAHomePage;
import SeleniumTestToolQA.pages.ToolsQAPracticeFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATest {


    @Test
    public void registration() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ToolsQAHomePage homePage = new ToolsQAHomePage(driver);
        homePage.goTo();
        ToolsQAFormsPage formsPage = homePage.openForms();
        ToolsQAPracticeFormPage practiceForm = formsPage.openPracticeForm();

        practiceForm.fillInForm("Test", "Persoon", "Male","0123456789");
        practiceForm.submit();

        driver.quit();

    }
}

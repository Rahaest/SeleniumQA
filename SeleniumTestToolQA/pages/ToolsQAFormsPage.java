package SeleniumTestToolQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQAFormsPage {

    WebDriver driver;
    By practiceFormLink = By.xpath("//span[text()='Practice Form']");

    public ToolsQAFormsPage(WebDriver driver){
        this.driver=driver;
    }

    public ToolsQAPracticeFormPage openPracticeForm() {
        driver.findElement(practiceFormLink).click();
        return new ToolsQAPracticeFormPage(driver);
    }
}

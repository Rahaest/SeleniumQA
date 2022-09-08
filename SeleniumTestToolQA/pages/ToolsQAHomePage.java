package SeleniumTestToolQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQAHomePage {

    WebDriver driver;
    By formsLink = By.xpath("//h5[text()='Forms']");

    public ToolsQAHomePage(WebDriver driver){
        this.driver=driver;
    }

    public void goTo() {
        driver.get("https://demoqa.com/");
    }

    public ToolsQAFormsPage openForms() {
        driver.findElement(formsLink).click();
        return new ToolsQAFormsPage(driver);
    }

}

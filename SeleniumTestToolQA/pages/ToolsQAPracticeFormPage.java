package SeleniumTestToolQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQAPracticeFormPage {

    WebDriver driver;
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By phoneNr = By.id("userNumber");
    By genderBtn;
    By submitBtn = By.id("submit");

    public ToolsQAPracticeFormPage(WebDriver driver){
        this.driver=driver;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
           genderBtn = By.xpath("//label[text()='Male']");
        } else if (gender.equalsIgnoreCase("female")) {
            genderBtn = By.xpath("//label[text()='Female']");
        } else {
            genderBtn = By.xpath("//label[text()='Other']");
        }
    }

    public void fillInForm(String firstNameStr, String lastNameStr, String gender, String phoneNrStr){
        driver.findElement(this.firstName).sendKeys(firstNameStr);
        driver.findElement(this.lastName).sendKeys(lastNameStr);
        setGender(gender);
        driver.findElement(genderBtn).click();
        driver.findElement(this.phoneNr).sendKeys(phoneNrStr);
    }

    public void submit() {
        driver.findElement(submitBtn).click();
    }

}

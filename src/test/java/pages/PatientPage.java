package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class PatientPage {
    @FindBy(tagName = "button")
    List<WebElement> btn;
    @FindBy(className = "heading")
    WebElement headingText;
    @FindBy(className = "custom-input")
    WebElement inputField;
    WebDriver driver;

    public PatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchPatient() throws InterruptedException {
        Utils.waitForElements(driver, headingText, 50);
        btn.get(12).click();
        inputField.sendKeys("111111111");
        Thread.sleep(500);
        btn.get(16).click();
        Thread.sleep(500);
        btn.get(25).click();
    }

}

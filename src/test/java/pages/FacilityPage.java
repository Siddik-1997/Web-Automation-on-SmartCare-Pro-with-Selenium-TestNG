package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class FacilityPage {
    @FindBy(className = "custom-input")
    List<WebElement> dropDown;
    @FindBy(className = "border")
    List<WebElement> option;
    @FindBy(className = "button")
    WebElement button;
    @FindBy(className = "text-base")
    WebElement subTitle;
    WebDriver driver;

    public FacilityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectFacility() throws InterruptedException {
        Utils.waitForElements(driver, subTitle, 50);
        // Selecting Province "Lusaka"
        dropDown.get(0).click();
        dropDown.get(0).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(0).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(0).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(0).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(0).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        dropDown.get(0).sendKeys(Keys.ENTER);
        Thread.sleep(300);

        // Selecting District "Lusaka"
        dropDown.get(1).click();
        dropDown.get(1).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(1).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(1).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(1).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(1).sendKeys(Keys.ARROW_DOWN);
        dropDown.get(1).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        dropDown.get(1).sendKeys(Keys.ENTER);
        Thread.sleep(300);

        // Selecting Facility "Dr Watson Dental Clinic"
        Thread.sleep(1000);
        dropDown.get(2).click();
        dropDown.get(2).sendKeys(Keys.ARROW_DOWN);
        option.get(1).click();
        button.click();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    @FindBy(className = "custom-input")
    List<WebElement> inputField;
    @FindBy(className = "button")
    WebElement button;
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/*[1]")
    WebElement logoutIcon;
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/button[1]")
    WebElement btnLogout;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String userName, String password) {
        inputField.get(0).sendKeys(userName);
        inputField.get(1).sendKeys(password);
        button.click();

    }

}

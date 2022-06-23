package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonPage {
    WebDriver driver;
    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement questionString;
    WebElement yesButton;
    WebElement impressiveButton;
    WebElement noButton;
    WebElement notificationYouSelected;
    List<WebElement> listButtons;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getQuestionString() {
        return driver.findElement(By.className("mb-3"));
    }
    public WebElement getYesButton() {
        listButtons = driver.findElements(By.className("custom-control-label"));
        return listButtons.get(0);
    }
    public WebElement getImpressiveButton() {
        listButtons = driver.findElements(By.className("custom-control-label"));
        return listButtons.get(1);
    }
    public WebElement getNoButton() {
        listButtons = driver.findElements(By.className("custom-control-label"));
        return listButtons.get(2);
    }

    public WebElement getNotificationYouSelected() {
        return driver.findElement(By.className("mt-3"));
    }

    //-------------------------------------------------------------------------------
    public void  clickOnYesButton () {
        getYesButton().click();
    }
    public void  clickOnImpressiveButton () {
        getImpressiveButton().click();
    }
    public void  clickOnNoButton () {
        getNoButton().click();
    }















}

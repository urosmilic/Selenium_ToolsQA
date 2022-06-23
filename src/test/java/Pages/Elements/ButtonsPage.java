package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage {
    WebDriver driver;
    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement doubleClickButton;
    WebElement rightClickButton;
    WebElement dynamicClickButton;
    WebElement doubleClickNotificationMessage;
    WebElement rightClickNotificationMessage;
    WebElement dynamicClickNotificationMessage;


    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getDoubleClickButton() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClickButton() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getDynamicClickButton() {
        return driver.findElement(By.xpath("//button[text()='Click Me']"));
    }

    public WebElement getDoubleClickNotificationMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickNotificationMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getDynamicClickNotificationMessage() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public void clickOnDynamicButton () {
        getDynamicClickButton().click();
    }









}

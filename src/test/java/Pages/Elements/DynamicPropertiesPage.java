package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicPropertiesPage {
    WebDriver driver;
    public DynamicPropertiesPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement willEnable5SecondsButton;
    WebElement colorChangeButton;
    WebElement visibleAfter5SecondsButton;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getWillEnable5SecondsButton() {
        return driver.findElement(By.id("enableAfter"));
    }

    public WebElement getColorChangeButton() {
        return driver.findElement(By.id("colorChange"));
    }

    public WebElement getVisibleAfter5SecondsButton() {
        return driver.findElement(By.id("visibleAfter"));
    }











}

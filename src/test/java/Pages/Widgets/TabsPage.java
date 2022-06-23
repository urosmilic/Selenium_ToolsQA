package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabsPage {
    WebDriver driver;
    public TabsPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }




}

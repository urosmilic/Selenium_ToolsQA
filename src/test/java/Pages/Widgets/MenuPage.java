package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    WebDriver driver;
    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement MainItem2Tab;
    WebElement subSubListTab;
    WebElement subSubItem1Tab;
    WebElement subSubItem2Tab;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getMainItem2Tab() {
        return driver.findElement(By.linkText("Main Item 2"));
    }
    public WebElement getSubSubListTab() {
        return driver.findElement(By.linkText("SUB SUB LIST »"));
    }
    public WebElement getSubSubItem1Tab() {
        return driver.findElement(By.linkText("Sub Sub Item 1"));
    }
    public WebElement getSubSubItem2Tab() {
        return driver.findElement(By.linkText("Sub Sub Item 2"));
    }
}

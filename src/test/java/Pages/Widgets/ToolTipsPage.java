package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolTipsPage {
    WebDriver driver;
    public ToolTipsPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement hoverMeButton;
    WebElement hoverMeTextbox;
    WebElement firstString;
    WebElement secondString;
    WebElement hoverPopUp;


    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getHoverMeButton() {
        return driver.findElement(By.id("toolTipButton"));
    }
    public WebElement getHoverMeTextbox() {
        return driver.findElement(By.id("toolTipTextField"));
    }
    public WebElement getFirstString() {
        return driver.findElement(By.xpath("//a[text()='Contrary']"));
    }
    public WebElement getSecondString() {
        return driver.findElement(By.xpath("//a[text()='1.10.32']"));
    }
    public WebElement getHoverPopUp() {
        return driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
    }


}

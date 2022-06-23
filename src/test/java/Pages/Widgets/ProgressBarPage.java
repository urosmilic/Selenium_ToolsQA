package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressBarPage {
    WebDriver driver;
    public ProgressBarPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement progressBar;
    WebElement startStopButton;
    WebElement resetButton;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getProgressBar() {
        return driver.findElement(By.xpath("//div[@role='progressbar']"));
    }
    public WebElement getStartStopButton() {
        return driver.findElement(By.id("startStopButton"));
    }
    public WebElement getResetButton() {
        return driver.findElement(By.id("resetButton"));
    }

    //----------------------------------------------------------------------------------------

    public void clickOnStartStopButton () {
        getStartStopButton().click();
    }
    public void clickOnResetButton () {
        getResetButton().click();
    }

}

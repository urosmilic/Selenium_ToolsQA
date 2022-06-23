package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks_ImagesPage {
    WebDriver driver;
    public BrokenLinks_ImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement validImage;
    WebElement brokenImage;
    WebElement validLink;
    WebElement brokenLink;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getValidImage() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]"));
    }
    public WebElement getBrokenImage() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]"));
    }
    public WebElement getValidLink() {
        return driver.findElement(By.linkText("Click Here for Valid Link"));
    }
    public WebElement getBrokenLink() {
        return driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']"));
    }
    //------------------------------------------------------------------------------------------------------------
    public void clickOnValidLink () {
        getValidLink().click();
    }

    public void clickOnBrokenLink () {
        getBrokenLink().click();
    }











}

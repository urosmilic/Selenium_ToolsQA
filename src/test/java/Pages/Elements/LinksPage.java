package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {
    WebDriver driver;
    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement homeLink;
    WebElement homeGenericLink;
    WebElement createdLink;
    WebElement noContentLink;
    WebElement MovedLink;
    WebElement badRequestLink;
    WebElement unauthorizedLink;
    WebElement forbiddenLink;
    WebElement notFoundLink;
    WebElement notificationMessage;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink"));
    }
    public WebElement getHomeGenericLink() {
        return driver.findElement(By.id("dynamicLink"));
    }
    public WebElement getCreatedLink() {
        return driver.findElement(By.id("created"));
    }
    public WebElement getNoContentLink() {
        return driver.findElement(By.id("no-content"));
    }
    public WebElement getMovedLink() {
        return driver.findElement(By.id("moved"));
    }
    public WebElement getBadRequestLink() {
        return driver.findElement(By.id("bad-request"));
    }
    public WebElement getUnauthorizedLink() {
        return driver.findElement(By.id("unauthorized"));
    }
    public WebElement getForbiddenLink() {
        return driver.findElement(By.id("forbidden"));
    }
    public WebElement getNotFoundLink() {
        return driver.findElement(By.id("invalid-url"));
    }
    public WebElement getNotificationMessage() {
        return driver.findElement(By.id("linkResponse"));
    }

    //-----------------------------------------------------------------------------------------------
    public void clickOnHomeLink () {
        getHomeLink().click();
    }
    public void  clickOnHomeGenericLink () {
        getHomeGenericLink().click();
    }
    public void clickOnCreatedLink () {
        getCreatedLink().click();
    }
    public void clickOnNoContentLink () {
        getNoContentLink().click();
    }
    public void clickOnMovedLink () {
        getMovedLink().click();
    }
    public void clickOnBadRequestLink () {
        getBadRequestLink().click();
    }
    public void clickOnUnauthorizedLink () {
        getUnauthorizedLink().click();
    }
    public void clickOnForbiddenLink () {
        getForbiddenLink().click();
    }
    public void clickOnNotFoundLink () {
        getNotFoundLink().click();
    }































}

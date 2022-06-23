package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    WebDriver driver;
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeader;
    WebElement fullNameTextbox;
    WebElement emailTextbox;
    WebElement currentAddressTextbox;
    WebElement permanentAddressTextbox;
    WebElement submitButton;
    WebElement fullNameResult;
    WebElement emailResult;
    WebElement currentAddressResult;
    WebElement permanentAddressResult;

    public WebElement getPageHeader() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getFullNameTextbox() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailTextbox() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddressTextbox() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressTextbox() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getFullNameResult() {
        return driver.findElement(By.xpath("//p[@id='name']"));
    }

    public WebElement getEmailResult() {
        return driver.findElement(By.xpath("//p[@id='email']"));
    }

    public WebElement getCurrentAddressResult() {
        return driver.findElement(By.xpath("//p[@id='currentAddress']"));
    }

    public WebElement getPermanentAddressResult() {
        return driver.findElement(By.xpath("//p[@id='permanentAddress']"));
    }

    //---------------------------------------------------------------------------------------

    public void enterFullName (String text) {
        getFullNameTextbox().clear();
        getFullNameTextbox().sendKeys(text);
    }

    public void enterEmail (String text) {
        getEmailTextbox().clear();
        getEmailTextbox().sendKeys(text);
    }

    public void enterCurrentAddress (String text) {
        getCurrentAddressTextbox().clear();
        getCurrentAddressTextbox().sendKeys(text);
    }

    public void enterPermanentAddress (String text) {
        getPermanentAddressTextbox().clear();
        getPermanentAddressTextbox().sendKeys(text);
    }

    public void clickOnSubmitButton () {
        getSubmitButton().click();
    }



























}

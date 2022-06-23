package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutoCompletePage {
    WebDriver driver;
    public AutoCompletePage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement multyColorNamesTextbox;
    WebElement singleColorNamesTextbox;
    WebElement clearMultyColorsButton;
    List<WebElement> listMultyColorNames;
    List<WebElement> listMultyColorX;
    WebElement singleColorName;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getMultyColorNamesTextbox() {
        return driver.findElement(By.id("autoCompleteMultipleInput"));
    }
    public WebElement getSingleColorNamesTextbox() {
        return driver.findElement(By.id("autoCompleteSingleInput"));
    }
    public WebElement getSingleColorName() {
        return driver.findElement(By.cssSelector(".auto-complete__single-value.css-1uccc91-singleValue"));
    }
    public WebElement getClearMultyColorsButton() {
        return driver.findElement(By.xpath("//div[@class='auto-complete__indicators css-1wy0on6']"));
    }
    public List<WebElement> getListMultyColorNames() {
        return driver.findElements(By.cssSelector(".css-12jo7m5.auto-complete__multi-value__label"));
    }
    public List<WebElement> getListMultyColorX() {
        return driver.findElements(By.cssSelector(".css-xb97g8.auto-complete__multi-value__remove"));
    }
    //----------------------------------------------------
    public void enterColorIntoMultyColorTextbox (String color) {
        getMultyColorNamesTextbox().sendKeys(color);
        getMultyColorNamesTextbox().sendKeys(Keys.ENTER);

    }
    public void enterColorIntoSingleColorTextbox (String color) {
        getSingleColorNamesTextbox().sendKeys(color);
        getSingleColorNamesTextbox().sendKeys(Keys.ENTER);
    }
    public void clickOnRemoveAllMultyColors () {
        getClearMultyColorsButton().click();
    }











}

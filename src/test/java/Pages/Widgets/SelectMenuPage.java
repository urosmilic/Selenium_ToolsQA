package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class SelectMenuPage {
    WebDriver driver;
    public SelectMenuPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement selectValueField;
    WebElement selectValueFieldValue;
    WebElement selectOneField;
    WebElement selectOneFieldValue;

    WebElement oldStyleSelectMenu;
    WebElement multiSelectDropDownField;
    WebElement multiSelectDropDownFieldValue;

    WebElement standardMultySelectMenu;
    WebElement multiSelectDropdownRemoveAllValuesButton;
    List<WebElement> listOfValues;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getSelectValueField() {
        return driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
    }

    public WebElement getSelectValueFieldValue() {
        listOfValues = driver.findElements(By.xpath("//div[@class=' css-1hwfws3']"));
        return listOfValues.get(0);
    }

    public WebElement getSelectOneField() {
        return driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
    }
    public WebElement getSelectOneFieldValue() {
        listOfValues = driver.findElements(By.xpath("//div[@class=' css-1hwfws3']"));
        return listOfValues.get(1);
    }

    public WebElement getOldStyleSelectMenu() {
        return driver.findElement(By.id("oldSelectMenu"));
    }
    public WebElement getMultiSelectDropDownField() {
        return driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
    }
    public WebElement getMultiSelectDropDownFieldValue() {
        listOfValues = driver.findElements(By.xpath("//div[@class=' css-1hwfws3']"));
        return listOfValues.get(2);
    }
    public WebElement getMultiSelectDropdownRemoveAllValuesButton() {
        return driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[2]/div[1]"));
    }
    public WebElement getStandardMultySelectMenu() {
        return driver.findElement(By.id("cars"));
    }
    //-----------------------------------------------------------------------------------------
    public void enterCharactersInSelectValueField (String string) {
        getSelectValueField().sendKeys(string);
        getSelectValueField().sendKeys(ENTER);
    }
    public void  enterCharactersInSelectOneField (String string) {
        getSelectOneField().sendKeys(string);
        getSelectOneField().sendKeys(ENTER);
    }
    public void  enterCharactersInMultiSelectDropdownField (String string) {
        getMultiSelectDropDownField().sendKeys(string);
        getMultiSelectDropDownField().sendKeys(ENTER);
    }







}

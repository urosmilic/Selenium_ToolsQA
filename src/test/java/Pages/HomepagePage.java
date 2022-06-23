package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepagePage {
    WebDriver driver;
    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement elementsBox;
    WebElement formsBox;
    WebElement alertsFrameAndWindowsBox;
    WebElement widgetsBox;
    WebElement interactionsBox;
    WebElement bookStoreApplicationBox;
    List<WebElement> listOfBoxes;

    public WebElement getElementsBox() {
        listOfBoxes = driver.findElements(By.className("card-body"));
        return listOfBoxes.get(0);
    }
    public WebElement getFormsBox() {
        listOfBoxes = driver.findElements(By.className("card-body"));
        return listOfBoxes.get(1);
    }
    public WebElement getAlertsFrameAndWindowsBox() {
        listOfBoxes = driver.findElements(By.className("card-body"));
        return listOfBoxes.get(2);
    }
    public WebElement getWidgetsBox() {
        listOfBoxes = driver.findElements(By.className("card-body"));
        return listOfBoxes.get(3);
    }
    public WebElement getInteractionsBox() {
        listOfBoxes = driver.findElements(By.className("card-body"));
        return listOfBoxes.get(4);
    }
    public WebElement getBookStoreApplicationBox() {
        listOfBoxes = driver.findElements(By.className("card-body"));
        return listOfBoxes.get(5);
    }
    //------------------------------------------------------------------------------
    public void  clickOnElementsBox () {
        getElementsBox().click();
    }
    public void  clickOnFormsBox () {
        getFormsBox().click();    }
    public void  clickOnAlertsFrameAndWindowsBox () {
        getAlertsFrameAndWindowsBox().click();
    }
    public void  clickOnWidgetsBox () {
        getWidgetsBox().click();
    }
    public void  clickOnInteractionsBox () {
        getInteractionsBox().click();
    }
    public void  clickOnBookStoreApplicationBox () {
        getBookStoreApplicationBox().click();
    }



}

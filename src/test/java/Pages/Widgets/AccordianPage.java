package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccordianPage {
    WebDriver driver;
    public AccordianPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement firstTab;
    WebElement secondTab;
    WebElement thirdTab;
    WebElement firstParagraph;
    WebElement secondParagraph;
    WebElement thirdParagraph;
    List<WebElement> listTabs;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getFirstTab() {
        listTabs = driver.findElements(By.className("card-header"));
        return listTabs.get(0);
    }
    public WebElement getSecondTab() {
        listTabs = driver.findElements(By.className("card-header"));
        return listTabs.get(1);
    }
    public WebElement getThirdTab() {
        listTabs = driver.findElements(By.className("card-header"));
        return listTabs.get(2);
    }

    public WebElement getFirstParagraph() {
        return driver.findElement(By.id("section1Content"));
    }
    public WebElement getSecondParagraph() {
        return driver.findElement(By.id("section2Content"));
    }
    public WebElement getThirdParagraph() {
        return driver.findElement(By.id("section3Content"));
    }

    //---------------------------------------------------------------------------------------------
    public void clickOnFirstTab () {
        getFirstTab().click();
    }
    public void clickOnSecondTab () {
        getSecondTab().click();
    }
    public void clickOnThirdTab () {
        getThirdTab().click();
    }




}

package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePickerPage {
    WebDriver driver;
    public DatePickerPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement selectDateTextbox;
    WebElement monthYearBanner;
    WebElement selectYearField;
    WebElement selectMonthField;
    WebElement dayPick;
    List<WebElement> listOfDays;
    WebElement dateAndTimeTextbox;
    WebElement monthYearBanner2;
    WebElement selectMonthField2;
    WebElement selectYearField2;
    List<WebElement> listOfMonths;
    List<WebElement> listOfYears;
    WebElement arrowDownDateAndTime2;
    WebElement godinaUListi;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getSelectDateTextbox() {
        return driver.findElement(By.id("datePickerMonthYearInput"));
    }
    public WebElement getMonthYearBanner() {
        return driver.findElement(By.cssSelector(".react-datepicker__current-month.react-datepicker__current-month--hasYearDropdown.react-datepicker__current-month--hasMonthDropdown"));
    }
    public WebElement getSelectYearField() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }
    public WebElement getSelectMonthField() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }
    public List<WebElement> getListOfDays() {
        return driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__day react')]"));
    }
    public WebElement getDateAndTimeTextbox() {
        return driver.findElement(By.id("dateAndTimePickerInput"));
    }
    public WebElement getSelectMonthField2() {
        return driver.findElement(By.className("react-datepicker__month-read-view--selected-month"));
    }
    public WebElement getSelectYearField2() {
        return driver.findElement(By.className("react-datepicker__year-read-view--selected-year"));
    }
    public WebElement getArrowDownDateAndTime2() {
        return driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--years.react-datepicker__navigation--years-previous"));
    }
    public WebElement getGodinaUListi() {
        return driver.findElement(By.xpath("//div[@class='react-datepicker__year-dropdown']/div[2]"));
    }
    //-----------------------------------------------------------------
    public void  clickOnSelectDateTextbox() {
        getSelectDateTextbox().click();
    }
    public void clickOnDay (String dayNumber) {
        listOfDays = driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__day react')]"));
        for (int i = 0; i < listOfDays.size(); i++) {
            if (listOfDays.get(i).getText().equals(dayNumber)) {
                listOfDays.get(i).click();
                break;
            }
        }
    }
    //-----------------------------------------------------------------------
    public void clickOnDateAndTimeTextbox () {
        getDateAndTimeTextbox().click();
    }
    public void clickOnMonth2 (int broj) {
        listOfMonths = driver.findElements(By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--scroll']/div/div"));
        listOfMonths.get(broj-1).click();
    }
    public void clickOnYear2 (String broj) {
        while (!getGodinaUListi().getText().equals(broj)) {
            getArrowDownDateAndTime2().click();
        }
        getGodinaUListi().click();
    }
    //------------------------------------------------------------------
    public void clickOnTimeElement (String time) {
        driver.findElement(By.xpath("//li[text()='"+time+"']")).click();
        //li[text()='00:15']
    }

}

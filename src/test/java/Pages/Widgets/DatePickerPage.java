package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage {
    WebDriver driver;
    public DatePickerPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement selectDateTextbox;
    WebElement yearCalendar;
    WebElement monthCalendar;
    WebElement dayCalendar;
    WebElement dateAndTimeTextbox;
    WebElement yearCalendar2;
    WebElement monthCalendar2;
    WebElement dayCalendar2;
    WebElement timeCalendar2;


    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getSelectDateTextbox() {
        return driver.findElement(By.id("datePickerMonthYearInput"));
    }

    public WebElement getYearCalendar() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }

    public WebElement getMonthCalendar() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }

    public WebElement getDayCalendar() {
        return dayCalendar;
    }

    public WebElement getDateAndTimeTextbox() {
        return dateAndTimeTextbox;
    }

    public WebElement getYearCalendar2() {
        return yearCalendar2;
    }

    public WebElement getMonthCalendar2() {
        return monthCalendar2;
    }

    public WebElement getDayCalendar2() {
        return dayCalendar2;
    }

    public WebElement getTimeCalendar2() {
        return timeCalendar2;
    }
    //-----------------------------------------------------------------
    public void  clickOnSelectDateTextbox() {
        getSelectDateTextbox().click();
    }














}

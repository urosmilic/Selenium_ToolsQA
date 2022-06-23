package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {
    WebDriver driver;
    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement addButton;
    WebElement searchTextbox;
    WebElement searchButton;

    WebElement firstName_1row;
    WebElement lastName_1row;
    WebElement age_1row;
    WebElement email_1row;
    WebElement salary_1row;
    WebElement department_1row;     //div[@class='rt-tr-group'][2]/div[1]/div[6] drugi red
    WebElement editButton_1row;
    WebElement deleteButton_1row;

    WebElement firstName_window;
    WebElement lastName_window;
    WebElement email_window;
    WebElement age_window;
    WebElement salary_window;
    WebElement department_window;
    WebElement submitButton_window;



    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getSearchTextbox() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.id("basic-addon2"));
    }

    public WebElement getFirstName_1row() {
        return driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]/div[1]/div[1]"));
    }

    public WebElement getLastName_1row() {
        return driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]/div[1]/div[2]"));
    }

    public WebElement getAge_1row() {
        return driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]/div[1]/div[3]"));
    }

    public WebElement getEmail_1row() {
        return driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]/div[1]/div[4]"));
    }

    public WebElement getSalary_1row() {
        return driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]/div[1]/div[5]"));
    }

    public WebElement getDepartment_1row() {
        return driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]/div[1]/div[6]"));
    }

    public WebElement getEditButton_1row() {
        return driver.findElement(By.id("edit-record-1"));
    }

    public WebElement getDeleteButton_1row() {
        return driver.findElement(By.id("delete-record-1"));
    }
    public WebElement getDeleteButton_2row() {
        return driver.findElement(By.id("delete-record-2"));
    }
    public WebElement getDeleteButton_3row() {
        return driver.findElement(By.id("delete-record-3"));
    }



    //--------------------------------------------------------------
    public WebElement getFirstName_window() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName_window() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail_window() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAge_window() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary_window() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment_window() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton_window() {
        return driver.findElement(By.id("submit"));
    }

    //--------------------------------------------------------------------

    public void enterTextInSearchBox (String text) {
        getSearchTextbox().clear();
        getSearchTextbox().sendKeys(text);
    }

    public void  clickOnAddButton () {
        getAddButton().click();
    }


    public void clickOnDeleteButton_1row () {
        getDeleteButton_1row().click();
    }
    public void clickOnDeleteButton_2row () {
        getDeleteButton_2row().click();
    }
    public void clickOnDeleteButton_3row () {
        getDeleteButton_3row().click();
    }

    public void clickOnEditButton_1row () {
        getEditButton_1row().click();
    }

    public void enterFullNameInWindow (String text) {
        getFirstName_window().clear();
        getFirstName_window().sendKeys(text);
    }
    public void enterLastNameInWindow (String text) {
        getLastName_window().clear();
        getLastName_window().sendKeys(text);
    }

    public void enterAgeInWindow (String number) {
        getAge_window().clear();
        getAge_window().sendKeys(number);
    }

    public void enterEmailInWindow (String text) {
        getEmail_window().clear();
        getEmail_window().sendKeys(text);
    }

    public void enterSalaryInWindow (String number) {
        getSalary_window().clear();
        getSalary_window().sendKeys(number);
    }

    public void enterDepartmentInWindow (String text) {
        getDepartment_window().clear();
        getDepartment_window().sendKeys(text);
    }

    public void clickOnSubmitButtonInWindow () {
        getSubmitButton_window().click();
    }














}

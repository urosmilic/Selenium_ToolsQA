package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarPage {

    WebDriver driver;
    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement elementsTab;    //----------------------
    WebElement pageHeader;
    WebElement textBoxTab;
    WebElement checkBoxTab;
    WebElement radioButtonTab;
    WebElement webTablesTab;
    WebElement buttonsTab;
    WebElement linksTab;
    WebElement brokenLinksImagesTab;
    WebElement uploadAndDownloadTab;
    WebElement dynamicPropertiesTab;

    WebElement formsTab;   //------------------------------
    WebElement practiceFormTab;

    WebElement alertsFrameAndWindowsTab;   //---------------------
    WebElement browserWindowsTab;
    WebElement alertsTab;
    WebElement framesTab;
    WebElement nestedFramesTab;
    WebElement modalDialogsTab;


    WebElement widgetsTab; //----------------------------
    WebElement accordianTab;
    WebElement autoCompleteTab;
    WebElement datePickerTab;
    WebElement sliderTab;
    WebElement progressBarTab;
    WebElement tabsTab;
    WebElement toolTipsTab;
    WebElement menuTab;
    WebElement selectMenuTab;

    //WebElement interactionsTab;
    //WebElement bookStoreApplicationTab;

    public WebElement getPageHeader() {
        return driver.findElement(By.className("main-header"));
    }
    //----------------------------------------
    public WebElement getElementsTab() {
        return driver.findElement(By.xpath("//span//div[text()='Elements']"));
    }
    public WebElement getTextBoxTab() {
        return driver.findElement(By.xpath("//span[text()='Text Box']"));
    }
    public WebElement getCheckBoxTab() {
        return driver.findElement(By.xpath("//span[text()='Check Box']"));
    }
    public WebElement getRadioButtonTab() {
        return driver.findElement(By.xpath("//span[text()='Radio Button']"));
    }
    public WebElement getWebTablesTab() {
        return driver.findElement(By.xpath("//span[text()='Web Tables']"));
    }
    public WebElement getButtonsTab() {
        return driver.findElement(By.xpath("//span[text()='Buttons']"));
    }
    public WebElement getLinksTab() {
        return driver.findElement(By.xpath("//span[text()='Links']"));
    }
    public WebElement getBrokenLinksImagesTab() {
        return driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
    }
    public WebElement getUploadAndDownloadTab() {
        return driver.findElement(By.xpath("//span[text()='Upload and Download']"));
    }
    public WebElement getDynamicPropertiesTab() {
        return driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
    }
    //-----------------------------------------------
    public WebElement getFormsTab() {
        return driver.findElement(By.xpath("//div[text()='Forms']"));
    }
    public WebElement getPracticeFormTab() {
        return driver.findElement(By.xpath("//span[text()='Practice Form']"));
    }

    //------------------------------------------------
    public WebElement getAlertsFrameAndWindowsTab() {
        return driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
    }
    public WebElement getBrowserWindowsTab() {
        return driver.findElement(By.xpath("//span[text()='Browser Windows']"));
    }
    public WebElement getAlertsTab() {
        return driver.findElement(By.xpath("//span[text()='Alerts']"));
    }
    public WebElement getFramesTab() {
        return driver.findElement(By.xpath("//span[text()='Frames']"));
    }
    public WebElement getNestedFramesTab() {
        return driver.findElement(By.xpath("//span[text()='Nested Frames']"));
    }
    public WebElement getModalDialogsTab() {
        return driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
    }

    //---------------------------------------------------
    public WebElement getWidgetsTab() {
        return driver.findElement(By.xpath("//div[text()='Widgets']"));
    }
    public WebElement getAccordianTab() {
        return driver.findElement(By.xpath("//span[text()='Accordian']"));
    }
    public WebElement getAutoCompleteTab() {
        return driver.findElement(By.xpath("//span[text()='Auto Complete']"));
    }
    public WebElement getDatePickerTab() {
        return driver.findElement(By.xpath("//span[text()='Date Picker']"));
    }
    public WebElement getSliderTab() {
        return driver.findElement(By.xpath("//span[text()='Slider']"));

    }
    public WebElement getProgressBarTab() {
        return driver.findElement(By.xpath("//span[text()='Progress Bar']"));
    }
    public WebElement getTabsTab() {
        return driver.findElement(By.xpath("//span[text()='Tabs']"));
    }
    public WebElement getToolTipsTab() {
        return driver.findElement(By.xpath("//span[text()='Tool Tips']"));
    }
    public WebElement getMenuTab() {
        return driver.findElement(By.xpath("//span[text()='Menu']"));
    }
    public WebElement getSelectMenuTab() {
        return driver.findElement(By.xpath("//span[text()='Select Menu']"));
    }

    //---------------------------------------------------

    public void  clickOnElementsTab () {
        getElementsTab().click();
    }
    public void clickOnTextBoxTab () {
        getTextBoxTab().click();
    }
    public void  clickOnCheckBoxTab () {
        getCheckBoxTab().click();
    }
    public void clickOnRadioButtonTab () {
        getRadioButtonTab().click();
    }
    public void clickOnWebTablesTab () {
        getWebTablesTab().click();
    }
    public void clickOnButtonsTab () {
        getButtonsTab().click();
    }
    public void clickOnLinksTab () {
        getLinksTab().click();
    }
    public void clickOnBrokenLinksImagesTab () {
        getBrokenLinksImagesTab().click();
    }
    public void clickOnUploadAndDownloadTab () {
        getUploadAndDownloadTab().click();
    }
    public void clickOnDynamicPropertiesTab () {
        getDynamicPropertiesTab().click();
    }

    public void  clickOnFormsTab () {
        getFormsTab().click();
    }
    public void clickOnPracticeFormTab () {
        getPracticeFormTab().click();
    }

    public void  clickOnAlertsFrameAndWindowsTab () {
        getAlertsFrameAndWindowsTab().click();
    }
    public void clickOnBrowserWindowsTab () {
        getBrowserWindowsTab().click();
    }
    public void  clickOnAlertsTab () {
        getAlertsTab().click();
    }
    public void  clickOnFramesTab () {
        getFramesTab().click();
    }
    public void  clickOnNestedFramesTab () {
        getNestedFramesTab().click();
    }
    public void  clickOnModalDialogsTab () {
       getModalDialogsTab().click();
    }

    public void  clickOnWidgetsTab () {
        getWidgetsTab().click();
    }
    public void clickOnAccordianTab () {
        getAccordianTab().click();
    }
    public void clickOnAutoCompleteTab () {
        getAutoCompleteTab().click();
    }
    public void clickOnDatePickerTab () {
        getDatePickerTab().click();
    }
    public void clickOnSliderTab () {
        getSliderTab().click();
    }
    public void clickOnProgressBarTab () {
        getProgressBarTab().click();
    }
    public void clickOnTabsTab () {
        getTabsTab().click();
    }
    public void clickOnToolTipsTab () {
        getToolTipsTab().click();
    }
    public void clickOnMenuTab () {
        getMenuTab().click();
    }
    public void clickOnSelectMenuTab () {
        getSelectMenuTab().click();
    }

    //---------------------------------------------------------------------------





































}

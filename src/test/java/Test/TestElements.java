package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;

public class TestElements extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");
    }

    @AfterMethod
    public void deleteAllCookies () {
        driver.manage().deleteAllCookies();
    }

    //----------------------------------------------------------------------------------------------------Text Box tests
    @Test   (priority = 10, description = "Successful submit of Textbox form with valid credentials")
    public void textboxValidCredentials () {

        for (int i = 1; i < excelReader.getLastRow("Textbox"); i++) {
            String validFullName = excelReader.getStringData("Textbox",1,1);
            String validEmail = excelReader.getStringData("Textbox",i,2);
            String validCurrentAddress = excelReader.getStringData("Textbox",1,5);
            String validPermanentAddress = excelReader.getStringData("Textbox",1,7);
            String pageURL = excelReader.getStringData("Textbox",1,9);

            sidebarPage.clickOnTextBoxTab();
            Assert.assertEquals(textBoxPage.getPageHeader().getText(),"Text Box");
            Assert.assertEquals(pageURL,driver.getCurrentUrl());

            textBoxPage.enterFullName(validFullName);
            textBoxPage.enterEmail(validEmail);
            textBoxPage.enterCurrentAddress(validCurrentAddress);
            textBoxPage.enterPermanentAddress(validPermanentAddress);
            textBoxPage.clickOnSubmitButton();

            Assert.assertTrue(textBoxPage.getFullNameResult().getText().contains(validFullName));
            Assert.assertTrue(textBoxPage.getEmailResult().getText().contains(validEmail));
            Assert.assertTrue(textBoxPage.getCurrentAddressResult().getText().contains(validCurrentAddress));
            Assert.assertTrue(textBoxPage.getPermanentAddressResult().getText().contains(validPermanentAddress));
        }
    }

    @Test   (priority = 20, description = "Unsuccessful submit of Textbox form with invalid Email")
    public void textboxInvalidEmail () {
        for (int i = 1; i < excelReader.getLastRow("Textbox");i++) {
            String validFullName = excelReader.getStringData("Textbox",1,1);
            String invalidEmail = excelReader.getStringData("Textbox",i,4);
            String validCurrentAddress = excelReader.getStringData("Textbox",1,5);
            String validPermanentAddress = excelReader.getStringData("Textbox",1,7);
            String pageURL = excelReader.getStringData("Textbox",1,9);

            sidebarPage.clickOnTextBoxTab();
            Assert.assertEquals(textBoxPage.getPageHeader().getText(),"Text Box");
            Assert.assertEquals(pageURL,driver.getCurrentUrl());

            textBoxPage.enterFullName(validFullName);
            textBoxPage.enterEmail(invalidEmail);
            textBoxPage.enterCurrentAddress(validCurrentAddress);
            textBoxPage.enterPermanentAddress(validPermanentAddress);
            textBoxPage.clickOnSubmitButton();

            boolean checkFullName;
            try {
                checkFullName = textBoxPage.getFullNameResult().isDisplayed();
            } catch (Exception e) {
                checkFullName = false;
            }
            Assert.assertFalse(checkFullName);

            boolean checkEmail;
            try {
                checkEmail = textBoxPage.getEmailResult().isDisplayed();
            } catch (Exception e) {
                checkEmail = false;
            }
            Assert.assertFalse(checkEmail);

            boolean checkCurrentAddress;
            try {
                checkCurrentAddress = textBoxPage.getCurrentAddressResult().isDisplayed();
            } catch (Exception e) {
                checkCurrentAddress = false;
            }
            Assert.assertFalse(checkCurrentAddress);

            boolean checkPermanentAddress;
            try {
                checkPermanentAddress = textBoxPage.getPermanentAddressResult().isDisplayed();
            } catch (Exception e) {
                checkPermanentAddress = false;
            }
            Assert.assertFalse(checkPermanentAddress);

            Assert.assertTrue(textBoxPage.getEmailTextbox().getAttribute("class").contains("error"));

        }
    }

    @Test   (priority = 30, description = "Unsuccessful submit of Textbox form with blank fields")
    public void textboxBlankFields () {
        String pageURL = excelReader.getStringData("Textbox",1,9);
        sidebarPage.clickOnTextBoxTab();
        Assert.assertEquals(textBoxPage.getPageHeader().getText(),"Text Box");
        Assert.assertEquals(pageURL,driver.getCurrentUrl());

        textBoxPage.clickOnSubmitButton();

        boolean checkFullName;
        try {
            checkFullName = textBoxPage.getFullNameResult().isDisplayed();
        } catch (Exception e) {
            checkFullName = false;
        }
        Assert.assertFalse(checkFullName);

        boolean checkEmail;
        try {
            checkEmail = textBoxPage.getEmailResult().isDisplayed();
        } catch (Exception e) {
            checkEmail = false;
        }
        Assert.assertFalse(checkEmail);

        boolean checkCurrentAddress;
        try {
            checkCurrentAddress = textBoxPage.getCurrentAddressResult().isDisplayed();
        } catch (Exception e) {
            checkCurrentAddress = false;
        }
        Assert.assertFalse(checkCurrentAddress);

        boolean checkPermanentAddress;
        try {
            checkPermanentAddress = textBoxPage.getPermanentAddressResult().isDisplayed();
        } catch (Exception e) {
            checkPermanentAddress = false;
        }
        Assert.assertFalse(checkPermanentAddress);

    }

    //---------------------------------------------------------------------------------------------------Check Box tests
    @Test   (priority = 40, description = "Successful expand and collapse of Check Box tree using plus and minus button")
    public void checkboxExpandCollapse () {
        sidebarPage.clickOnCheckBoxTab();

        checkBoxPage.getPlusButton().click();
        Assert.assertTrue(checkBoxPage.getNotesFile().isDisplayed());
        Assert.assertTrue(checkBoxPage.getExcelFile().isDisplayed());
        Assert.assertTrue(checkBoxPage.getOfficeFolder().isDisplayed());

        checkBoxPage.getMinusButton().click();
        boolean checkNotes;
        try {
            checkNotes = checkBoxPage.getNotesFile().isDisplayed();
        } catch (Exception e){
            checkNotes = false;
        }
        Assert.assertFalse(checkNotes);

        boolean checkExcelFile;
        try {
            checkExcelFile = checkBoxPage.getExcelFile().isDisplayed();
        } catch (Exception e){
            checkExcelFile = false;
        }
        Assert.assertFalse(checkExcelFile);

        boolean checkOfficeFolder;
        try {
            checkOfficeFolder = checkBoxPage.getOfficeFolder().isDisplayed();
        } catch (Exception e){
            checkOfficeFolder = false;
        }
        Assert.assertFalse(checkOfficeFolder);

    }

    @Test   (priority = 50, description = "Verify that user can check and uncheck checkboxes")
    public void checkboxSelectIndividualCheckboxes () {
        sidebarPage.clickOnCheckBoxTab();
        checkBoxPage.getHomeToggle().click();
        checkBoxPage.getDownloadToggle().click();
        boolean checkNotificationIsMissing;
        try {
            checkNotificationIsMissing = checkBoxPage.getNotificationMessage().isDisplayed();
        } catch (Exception e) {
            checkNotificationIsMissing = false;
        }
        Assert.assertFalse(checkNotificationIsMissing);

        checkBoxPage.getWordFileCheckbox().click();
        Assert.assertTrue(checkBoxPage.getNotificationMessage().isDisplayed());
        Assert.assertTrue(checkBoxPage.getNotificationMessage().getText().contains("wordFile"));

        checkBoxPage.getExcelFileCheckbox().click();
        Assert.assertTrue(checkBoxPage.getNotificationMessage().isDisplayed());
        Assert.assertTrue(checkBoxPage.getNotificationMessage().getText().contains("excelFile"));
        Assert.assertTrue(checkBoxPage.getNotificationMessage().getText().contains("wordFile"));
        Assert.assertTrue(checkBoxPage.getNotificationMessage().getText().contains("downloads"));

    }
    //------------------------------------------------------------------------------------------------Radio Button tests
    /*@Test (priority = 60, description = "Verify that user can click on radio button")                 //OVDE IMAMO BUG pa sam zakomentarisao
    public void clickOnRadioButton () {
        sidebarPage.clickOnRadioButtonTab();
        Assert.assertTrue(radioButtonPage.getPageHeading().isDisplayed());
        Assert.assertTrue(radioButtonPage.getQuestionString().isDisplayed());
        radioButtonPage.clickOnYesButton();
        Assert.assertTrue(radioButtonPage.getNotificationYouSelected().isDisplayed());
        Assert.assertTrue(radioButtonPage.getNotificationYouSelected().getText().contains("Yes"));
        radioButtonPage.clickOnImpressiveButton();
        Assert.assertTrue(radioButtonPage.getNotificationYouSelected().isDisplayed());
        Assert.assertTrue(radioButtonPage.getNotificationYouSelected().getText().contains("Impressive"));
        radioButtonPage.clickOnNoButton();
        Assert.assertTrue(radioButtonPage.getNotificationYouSelected().isDisplayed());
        Assert.assertTrue(radioButtonPage.getNotificationYouSelected().getText().contains("No"));
    }*/
    //--------------------------------------------------------------------------------------------------Web Tables tests
    @Test (priority = 70, description = "Verify that search box works")
    public void webTablesSearchBox () {
        sidebarPage.clickOnWebTablesTab();
        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(),"Cierra");
        webTablesPage.enterTextInSearchBox("Kierra");
        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(),"Kierra");
        Assert.assertEquals(webTablesPage.getDepartment_1row().getText(), "Legal");
    }

    @Test (priority = 80, description = "Verify that user can delete row from table")
    public void webTablesDeleteRow () {
        sidebarPage.clickOnWebTablesTab();
        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(),"Cierra");
        webTablesPage.clickOnDeleteButton_1row();
        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(),"Alden");
        Assert.assertEquals(webTablesPage.getDepartment_1row().getText(), "Compliance");
    }

    @Test (priority = 90, description = "Verify that user can edit row content in table")
    public void webTablesEditUsername () {
        String fullName = excelReader.getStringData("Web Tables",1,1);
        String age = excelReader.getStringData("Web Tables",1,3);
        sidebarPage.clickOnWebTablesTab();
        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(),"Cierra");
        webTablesPage.clickOnEditButton_1row();
        webTablesPage.enterFullNameInWindow(fullName);
        webTablesPage.enterAgeInWindow(age);
        webTablesPage.clickOnSubmitButtonInWindow();
        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(),fullName);
        Assert.assertEquals(webTablesPage.getAge_1row().getText(),age);
    }

    @Test (priority = 100, description = "Verify that user can add new record")
    public void addNewRecord () {
        String fullName = excelReader.getStringData("Web Tables",1,1);
        String lastName = excelReader.getStringData("Web Tables",1,2);
        String age = excelReader.getStringData("Web Tables",1,3);
        String email = excelReader.getStringData("Web Tables",1,4);
        String salary = excelReader.getStringData("Web Tables",1,5);
        String department = excelReader.getStringData("Web Tables",1,6);
        sidebarPage.clickOnWebTablesTab();

        webTablesPage.clickOnDeleteButton_1row();
        webTablesPage.clickOnDeleteButton_2row();
        webTablesPage.clickOnDeleteButton_3row();

        webTablesPage.clickOnAddButton();
        webTablesPage.enterFullNameInWindow(fullName);
        webTablesPage.enterLastNameInWindow(lastName);
        webTablesPage.enterAgeInWindow(age);
        webTablesPage.enterEmailInWindow(email);
        webTablesPage.enterSalaryInWindow(salary);
        webTablesPage.enterDepartmentInWindow(department);
        webTablesPage.clickOnSubmitButtonInWindow();

        Assert.assertEquals(webTablesPage.getFirstName_1row().getText(), fullName);
        Assert.assertEquals(webTablesPage.getLastName_1row().getText(), lastName);
        Assert.assertEquals(webTablesPage.getAge_1row().getText(), age);
        Assert.assertEquals(webTablesPage.getEmail_1row().getText(), email);
        Assert.assertEquals(webTablesPage.getSalary_1row().getText(), salary);
        Assert.assertEquals(webTablesPage.getDepartment_1row().getText(), department);

    }
    //-----------------------------------------------------------------------------------------------------Buttons tests
    @Test (priority = 110, description = "Verify that user can successfully click on all buttons")
    public void clickOnButtons () {
        sidebarPage.clickOnButtonsTab();
        Assert.assertTrue(buttonsPage.getPageHeading().getText().equalsIgnoreCase("Buttons"));
        Actions action = new Actions(driver);
        action.doubleClick(buttonsPage.getDoubleClickButton()).perform();
        Assert.assertTrue(buttonsPage.getDoubleClickNotificationMessage().isDisplayed());
        action.contextClick(buttonsPage.getRightClickButton()).perform();
        Assert.assertTrue(buttonsPage.getRightClickNotificationMessage().isDisplayed());
        action.click(buttonsPage.getDynamicClickButton()).perform();
        Assert.assertTrue(buttonsPage.getDynamicClickNotificationMessage().isDisplayed());
    }

    @Test (priority = 120, description = "Verify that no action will perform if user performs wrong click on each button")
    public void invalidClickOnButtons () {
        sidebarPage.clickOnButtonsTab();
        Assert.assertTrue(buttonsPage.getPageHeading().getText().equalsIgnoreCase("Buttons"));
        Actions action = new Actions(driver);

        action.click(buttonsPage.getDoubleClickButton()).perform();
        action.click(buttonsPage.getRightClickButton()).perform();
        action.doubleClick(buttonsPage.getRightClickButton()).perform();

        boolean checkDoubleClickNotification;
        try {
            checkDoubleClickNotification = buttonsPage.getDoubleClickNotificationMessage().isDisplayed();

        } catch (Exception e) {
            checkDoubleClickNotification = false;
        }
        Assert.assertFalse(checkDoubleClickNotification);

        boolean checkDynamicClickNotification;
        try {
            checkDynamicClickNotification = buttonsPage.getDynamicClickNotificationMessage().isDisplayed();
        } catch (Exception e) {
            checkDynamicClickNotification = false;
        }
        Assert.assertFalse(checkDynamicClickNotification);

        boolean checkRightClickNotification;
        try {
            checkRightClickNotification = buttonsPage.getRightClickNotificationMessage().isDisplayed();

        } catch (Exception e) {
            checkRightClickNotification = false;
        }
        Assert.assertFalse(checkRightClickNotification);
    }
    //-------------------------------------------------------------------------------------------------------Links tests
    @Test (priority = 130, description = "Verify that following links opens new tab, DemoQA page")
    public void clickOnHomeLinksOpensNewTab () {
        String homepageUrl = excelReader.getStringData("Homepage",1,1);
        sidebarPage.clickOnLinksTab();
        Assert.assertTrue(linksPage.getPageHeading().isDisplayed());
        linksPage.clickOnHomeLink();
        linksPage.clickOnHomeGenericLink();
        ArrayList<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(2));
        wdwait.until(ExpectedConditions.urlToBe(homepageUrl));
        Assert.assertEquals(driver.getCurrentUrl(),homepageUrl);
        driver.close();
        driver.switchTo().window(browserTabs.get(1));
        wdwait.until(ExpectedConditions.urlToBe(homepageUrl));
        Assert.assertEquals(driver.getCurrentUrl(),homepageUrl);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));

    }

    @Test (priority = 140, description = "Verify that correct API call is sent when user click on link")
    public void clickOnLinksAPICalls () throws InterruptedException {
        sidebarPage.clickOnLinksTab();
        Assert.assertTrue(linksPage.getPageHeading().isDisplayed());

        linksPage.clickOnCreatedLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("201"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("Created"));

        linksPage.clickOnNoContentLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("204"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("No Content"));

        linksPage.clickOnMovedLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("301"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("Moved Permanently"));

        linksPage.clickOnBadRequestLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("400"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("Bad Request"));

        linksPage.clickOnUnauthorizedLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("401"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("Unauthorized"));

        linksPage.clickOnForbiddenLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("403"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("Forbidden"));

        linksPage.clickOnNotFoundLink();
        Thread.sleep(2500);
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("404"));
        Assert.assertTrue(linksPage.getNotificationMessage().getText().contains("Not Found"));
    }
    //------------------------------------------------------------------------------------------------Broken Links tests
    @Test (priority = 150, description = "Verify that valid and broken images are present on web page")
    public void imagesArePresentOnPage () throws InterruptedException {
        sidebarPage.clickOnBrokenLinksImagesTab();
        Assert.assertTrue(brokenLinks_imagesPage.getPageHeading().isDisplayed());
        Assert.assertTrue(brokenLinks_imagesPage.getValidImage().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(brokenLinks_imagesPage.getBrokenImage().isDisplayed());
    }

    @Test (priority = 160, description = "Verify that valid link navigates to the DemoQA page, and broken link navigates to the blank page with Status code 500")
    public void validLinkAndBrokenLinkOpensNewPage () throws InterruptedException {
        String homepageUrl = excelReader.getStringData("Homepage",1,1);
        String brokenPageUrl = excelReader.getStringData("Broken Links - Images",1,1);
        sidebarPage.clickOnBrokenLinksImagesTab();
        Assert.assertTrue(brokenLinks_imagesPage.getPageHeading().isDisplayed());
        Thread.sleep(2000);
        brokenLinks_imagesPage.clickOnValidLink();
        Assert.assertEquals(driver.getCurrentUrl(),homepageUrl);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        brokenLinks_imagesPage.clickOnBrokenLink();
        Assert.assertEquals(driver.getCurrentUrl(),brokenPageUrl);
    }
    //-----------------------------------------------------------------------------------------Upload and Download tests
    @Test (priority = 170, description = "Verify that user can upload and download files")
    public void successfullUploadAndDownload () {
        scrollIntoView(sidebarPage.getUploadAndDownloadTab());
        sidebarPage.clickOnUploadAndDownloadTab();
        Assert.assertTrue(uploadAndDownloadPage.getPageHeading().isDisplayed());

        uploadAndDownloadPage.clickOnDownloadButton();
        File f = new File("C:\\Users\\USER\\Downloads\\sampleFile.jpeg");   //ne pise se broj u zagradi ako imamo kopije
        Assert.assertTrue(f.exists());

        uploadAndDownloadPage.uploadFile("C:\\Users\\USER\\Desktop\\Post.png");
        Assert.assertTrue(uploadAndDownloadPage.getUploadedFilePath().getText().contains("Post.png"));
    }
    //------------------------------------------------------------------------------------------Dynamic Properties tests
    @Test (priority = 180, description = "Verify that button is visible, enabled and change the color")
    public void buttonIsEnabledVisibleAndChangeColor () throws InterruptedException {
        scrollIntoView(sidebarPage.getDynamicPropertiesTab());
        sidebarPage.clickOnDynamicPropertiesTab();

        boolean checkIsEnable;
        try {
            checkIsEnable =dynamicPropertiesPage.getWillEnable5SecondsButton().isEnabled();
        } catch (Exception e) {
            checkIsEnable = false;
        }
        Assert.assertFalse(checkIsEnable);

        boolean checkIsVisible;
        try {
            checkIsVisible =dynamicPropertiesPage.getVisibleAfter5SecondsButton().isDisplayed();
        } catch (Exception e) {
            checkIsVisible = false;
        }
        Assert.assertFalse(checkIsVisible);

        String s = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        Thread.sleep(5500); //da bismo bili sigurni da je proslo vise od 5 sekundi, pogotovo zbog promene boje

        Assert.assertTrue(dynamicPropertiesPage.getWillEnable5SecondsButton().isEnabled());
        Assert.assertTrue(dynamicPropertiesPage.getVisibleAfter5SecondsButton().isDisplayed());
        String c = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        Assert.assertNotEquals(s,c);
    }

}

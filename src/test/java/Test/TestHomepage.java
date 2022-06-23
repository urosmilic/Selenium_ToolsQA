package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomepage extends BaseTest {

    @BeforeMethod
    public void pageSetUp () {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

    }
    @AfterMethod
    public void deleteAllCookies () {
        driver.manage().deleteAllCookies();
    }

    @Test (priority = 10, description = "Verify that user can successfully navigate to desirable page by clicking on each of 6 boxes")
    public void clickOnWebPagesBoxes () {
        String elementsURL = excelReader.getStringData("Homepage",1,2);
        String formsURL = excelReader.getStringData("Homepage",1,3);
        String alertsWindowsURL = excelReader.getStringData("Homepage",1,4);
        String widgetsURL = excelReader.getStringData("Homepage",1,5);
        String interactionURL = excelReader.getStringData("Homepage",1,6);
        String bookStoreAppURL = excelReader.getStringData("Homepage",1,7);

        homepagePage.clickOnElementsBox();
        Assert.assertEquals(driver.getCurrentUrl(),elementsURL);
        driver.navigate().back();
        homepagePage.clickOnFormsBox();
        Assert.assertEquals(driver.getCurrentUrl(),formsURL);
        driver.navigate().back();
        homepagePage.clickOnAlertsFrameAndWindowsBox();
        Assert.assertEquals(driver.getCurrentUrl(),alertsWindowsURL);
        driver.navigate().back();
        homepagePage.clickOnWidgetsBox();
        Assert.assertEquals(driver.getCurrentUrl(),widgetsURL);
        driver.navigate().back();
        homepagePage.clickOnInteractionsBox();
        Assert.assertEquals(driver.getCurrentUrl(),interactionURL);
        driver.navigate().back();
        scrollIntoView(homepagePage.getBookStoreApplicationBox());
        homepagePage.clickOnBookStoreApplicationBox();
        Assert.assertEquals(driver.getCurrentUrl(),bookStoreAppURL);
    }

}

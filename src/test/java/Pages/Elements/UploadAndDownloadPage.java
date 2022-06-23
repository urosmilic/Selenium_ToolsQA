package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownloadPage {
    WebDriver driver;
    public UploadAndDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement pageHeading;
    WebElement downloadButton;
    WebElement uploadButton;
    WebElement uploadedFilePath;

    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }

    public WebElement getUploadButton() {
        return driver.findElement(By.id("uploadFile"));
    }

    public WebElement getUploadedFilePath() {
        return driver.findElement(By.id("uploadedFilePath"));
    }

    //------------------------------------------------------------------
    public void clickOnDownloadButton () {
        getDownloadButton().click();
    }
    public void uploadFile (String adresaFajla) {
        getUploadButton().sendKeys(adresaFajla);
    }


















}

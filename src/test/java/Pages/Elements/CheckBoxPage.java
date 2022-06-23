package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage {
    WebDriver driver;
    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement plusButton;
    WebElement minusButton;

    WebElement homeToggle;
    WebElement desktopToggle;
    WebElement downloadToggle;

    WebElement homeCheckbox;
    WebElement wordFileCheckbox;
    WebElement excelFileCheckbox;
    WebElement downloadFolderCheckbox;
    WebElement desktopFolderCheckbox;
    WebElement excelFileCheckboxInfo;


    WebElement notesFile;
    WebElement excelFile;
    WebElement officeFolder;

    WebElement notificationMessage;
    List<WebElement> listToggles;

    public WebElement getPlusButton() {
        return driver.findElement(By.xpath("//button[@title='Expand all']"));
    }
    public WebElement getMinusButton() {
        return driver.findElement(By.xpath("//button[@title='Collapse all']"));
    }
    public WebElement getNotificationMessage() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getHomeCheckbox() {
        return driver.findElement(By.className("rct-checkbox"));
    }

    public WebElement getDownloadFolderCheckbox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]"));
    }

    public WebElement getWordFileCheckbox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
    }

    public WebElement getExcelFileCheckbox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
    }

    public WebElement getDesktopFolderCheckbox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
    }

    public WebElement getExcelFileCheckboxInfo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]/svg"));
    }

    public WebElement getNotesFile() {
        return driver.findElement(By.xpath("//label[@for='tree-node-notes']"));
    }
    public WebElement getExcelFile() {
        return driver.findElement(By.xpath("//label[@for='tree-node-excelFile']"));
    }
    public WebElement getOfficeFolder() {
        return driver.findElement(By.xpath("//label[@for='tree-node-office']"));
    }

    public WebElement getHomeToggle() {
        listToggles = driver.findElements(By.xpath("(//button[@title='Toggle'])"));
        return listToggles.get(0);
    }
    public WebElement getDesktopToggle() {
        listToggles = driver.findElements(By.xpath("(//button[@title='Toggle'])"));
        return listToggles.get(1);
    }
    public WebElement getDownloadToggle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[3]/span/button"));
    }















}

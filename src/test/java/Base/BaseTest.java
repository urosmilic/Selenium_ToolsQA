package Base;

import Pages.*;
import Pages.Elements.*;
import Pages.Widgets.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public JavascriptExecutor js;
    public ExcelReader excelReader;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinks_ImagesPage brokenLinks_imagesPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public DatePickerPage datePickerPage;
    public MenuPage menuPage;
    public ProgressBarPage progressBarPage;
    public SelectMenuPage selectMenuPage;
    public SliderPage sliderPage;
    public TabsPage tabsPage;
    public ToolTipsPage toolTipsPage;

    @BeforeClass
    public void setUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        excelReader = new ExcelReader("C:\\Users\\USER\\Desktop\\ToolsQATestData.xlsx");    //podesiti putanju u odnosu gde se nalazi excel fajl ToolsQATestData.xlsx
        homepagePage = new HomepagePage(driver);
        sidebarPage = new SidebarPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage(driver);
        buttonsPage = new ButtonsPage(driver);
        linksPage = new LinksPage(driver);
        brokenLinks_imagesPage = new BrokenLinks_ImagesPage(driver);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver);
        accordianPage = new AccordianPage(driver);
        autoCompletePage = new AutoCompletePage(driver);
        datePickerPage = new DatePickerPage(driver);
        menuPage = new MenuPage(driver);
        progressBarPage = new ProgressBarPage(driver);
        selectMenuPage = new SelectMenuPage(driver);
        sliderPage = new SliderPage(driver);
        tabsPage = new TabsPage(driver);
        toolTipsPage = new ToolTipsPage(driver);
    }

    @AfterClass
    public  void tearDown () {
        driver.close();
        driver.quit();
    }

    public void scrollIntoView (WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public void waitUntilElementisVisible (WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilElementisNotVisible (WebElement element) {
        wdwait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitUntilElementisClickable (WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void hideElement (WebElement element) {
        js.executeScript("arguments[0].style.visibility='hidden'", element);
    }









}

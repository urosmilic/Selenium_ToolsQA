package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPage {
    WebDriver driver;
    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement pageHeading;
    WebElement slider;
    WebElement sliderValueBox;
    public WebElement getPageHeading() {
        return driver.findElement(By.className("main-header"));
    }
    public WebElement getSlider() {
        return driver.findElement(By.xpath("//input[@type='range']"));
    }

    public WebElement getSliderValueBox() {
        return driver.findElement(By.id("sliderValue"));
    }



}

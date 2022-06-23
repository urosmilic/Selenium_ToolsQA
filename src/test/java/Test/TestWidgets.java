package Test;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestWidgets extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/widgets");
    }
    @AfterMethod
    public void deleteAllCookies () {
        driver.manage().deleteAllCookies();
    }
    //---------------------------------------------------------------------------------------------------Accordian tests
    @Test (priority = 10, description = "Verify that user can open only one paragraph at the same time")
    public void verifyThatClickingOnOneTabOpensParagraphAndClosesParagraphOfOtherTab () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        waitUntilElementisClickable(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        waitUntilElementisClickable(sidebarPage.getAccordianTab());
        sidebarPage.clickOnAccordianTab();
        scrollIntoView(accordianPage.getPageHeading());
        Assert.assertTrue(accordianPage.getPageHeading().isDisplayed());
        Assert.assertTrue(accordianPage.getFirstParagraph().isDisplayed());

        accordianPage.clickOnFirstTab();
        waitUntilElementisNotVisible(accordianPage.getFirstParagraph());
        boolean checkFirstParagraph;
        try {
            checkFirstParagraph = accordianPage.getFirstParagraph().isDisplayed();
        } catch (Exception e) {
            checkFirstParagraph = false;
        }
        Assert.assertFalse(checkFirstParagraph);

        accordianPage.clickOnSecondTab();
        waitUntilElementisVisible(accordianPage.getSecondParagraph());
        Assert.assertTrue(accordianPage.getSecondParagraph().isDisplayed());

        accordianPage.clickOnThirdTab();
        waitUntilElementisVisible(accordianPage.getThirdParagraph());
        Assert.assertTrue(accordianPage.getThirdParagraph().isDisplayed());

        waitUntilElementisNotVisible(accordianPage.getSecondParagraph());
        boolean checkSecondParagraph;
        try {
            checkSecondParagraph = accordianPage.getSecondParagraph().isDisplayed();
        } catch (Exception e) {
            checkSecondParagraph = false;
        }
        Assert.assertFalse(checkSecondParagraph);

    }
    //-----------------------------------------------------------------------------------------------Auto Complete tests
    @Test (priority = 20, description = "add color in multi color field")
    public void addMultipleColorsInMultipleColorTextbox () throws InterruptedException {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        waitUntilElementisClickable(sidebarPage.getAutoCompleteTab());
        sidebarPage.clickOnAutoCompleteTab();
        scrollIntoView(autoCompletePage.getPageHeading());
        autoCompletePage.enterColorIntoMultyColorTextbox("blu");
        autoCompletePage.enterColorIntoMultyColorTextbox("bla");
        Assert.assertEquals(autoCompletePage.getListMultyColorNames().get(0).getText(),"Blue");     //dokaz da je uneta boja Blue preko stringa "blu"
        Assert.assertEquals(autoCompletePage.getListMultyColorNames().get(1).getText(),"Black");    //dokaz da je uneta boja Black preko stringa "bla"
        autoCompletePage.clickOnRemoveAllMultyColors();
        boolean checkEmptyMultyColorTextbox;
        try {
            checkEmptyMultyColorTextbox = autoCompletePage.getListMultyColorNames().get(0).isDisplayed();
        } catch (Exception e) {
            checkEmptyMultyColorTextbox = false;
        }
        Assert.assertFalse(checkEmptyMultyColorTextbox);    //dokaz da su sve boje obrisane
        autoCompletePage.enterColorIntoMultyColorTextbox("blu");
        autoCompletePage.enterColorIntoMultyColorTextbox("bla");

        autoCompletePage.getListMultyColorX().get(1).click();
        boolean checkMultyColorTextbox;
        try {
            checkMultyColorTextbox = autoCompletePage.getListMultyColorNames().get(1).isDisplayed();
        } catch (Exception e) {
            checkMultyColorTextbox = false;
        }
        Assert.assertFalse(checkMultyColorTextbox);    //dokaz da je druga boja obrisana
        Assert.assertTrue(autoCompletePage.getListMultyColorNames().get(0).isDisplayed());
    }

    @Test (priority = 30, description = "add color in single color field")
    public void addColorInSingleColorTextbox () throws InterruptedException {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        waitUntilElementisClickable(sidebarPage.getAutoCompleteTab());
        sidebarPage.clickOnAutoCompleteTab();
        scrollIntoView(autoCompletePage.getPageHeading());
        autoCompletePage.enterColorIntoSingleColorTextbox("re");                                //koristimo samo string "re" ostalo je auto complete
        Assert.assertEquals(autoCompletePage.getSingleColorName().getText(),"Red");     //dokaz da je auto completom uneta boja "Red"
        autoCompletePage.enterColorIntoSingleColorTextbox("y");                                 //koristimo samo karakter "y" ostalo je auto complete
        Assert.assertEquals(autoCompletePage.getSingleColorName().getText(),"Yellow");  //dokaz da smo sa y pregazili prethodni unos i sada je seletovana boja "Yellow"
    }
    //-------------------------------------------------------------------------------------------------Date Picker tests

    //URADITI DATE PICKER TESTOVE

    //------------------------------------------------------------------------------------------------------Slider tests
    @Test (priority = 60, description = "Verify that user can move slider forward and backward")
    public void moveSlidebarBackwardAndForward () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        waitUntilElementisClickable(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getSliderTab());
        waitUntilElementisClickable(sidebarPage.getSliderTab());
        sidebarPage.clickOnSliderTab();
        String initialValue = sliderPage.getSliderValueBox().getAttribute("value");
        Actions action = new Actions(driver);
        action.dragAndDropBy(sliderPage.getSlider(), -200,0).perform();
        String decresedValue = sliderPage.getSliderValueBox().getAttribute("value");
        Assert.assertNotEquals(initialValue,decresedValue);
        action.dragAndDropBy(sliderPage.getSlider(), 300,0).perform();
        String incresedValue = sliderPage.getSliderValueBox().getAttribute("value");
        Assert.assertNotEquals(decresedValue,incresedValue);
    }
    //------------------------------------------------------------------------------------------------Progress Bar tests
    @Test (priority = 70, description = "verify that progress bar is loading")
    public void progressBarIsLoading () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        waitUntilElementisClickable(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getProgressBarTab());
        sidebarPage.clickOnProgressBarTab();
        scrollIntoView(progressBarPage.getPageHeading());
        Assert.assertTrue(progressBarPage.getPageHeading().isDisplayed());
        Assert.assertTrue(progressBarPage.getProgressBar().getAttribute("aria-valuenow").equalsIgnoreCase("0"));
        System.out.println(progressBarPage.getProgressBar().getAttribute("aria-valuenow"));
        progressBarPage.clickOnStartStopButton();
        waitUntilElementisNotVisible(progressBarPage.getStartStopButton());
        Assert.assertTrue(progressBarPage.getProgressBar().getAttribute("aria-valuenow").equalsIgnoreCase("100"));
        progressBarPage.clickOnResetButton();
        waitUntilElementisVisible(progressBarPage.getStartStopButton());
        Assert.assertTrue(progressBarPage.getProgressBar().getAttribute("aria-valuenow").equalsIgnoreCase("0"));
    }
    //---------------------------------------------------------------------------------------------------Tool Tips tests
    @Test (priority = 80, description = "Verify that user get pop up message when hovers web elements")
    public void getHoverPopUp () throws InterruptedException {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getToolTipsTab());
        sidebarPage.clickOnToolTipsTab();
        scrollIntoView(toolTipsPage.getPageHeading());
        Actions action = new Actions(driver);
        action.moveToElement(toolTipsPage.getHoverMeButton()).perform();
        Thread.sleep(1000);
        Assert.assertTrue(toolTipsPage.getHoverPopUp().getText().contains("You hovered over the Button"));
        action.moveToElement(toolTipsPage.getHoverMeTextbox()).perform();
        Thread.sleep(1000);
        Assert.assertTrue(toolTipsPage.getHoverPopUp().getText().contains("You hovered over the text field"));
        action.moveToElement(toolTipsPage.getFirstString()).perform();
        Thread.sleep(1000);
        Assert.assertTrue(toolTipsPage.getHoverPopUp().getText().contains("You hovered over the Contrary"));
        action.moveToElement(toolTipsPage.getSecondString()).perform();
        Thread.sleep(1000);
        Assert.assertTrue(toolTipsPage.getHoverPopUp().getText().contains("You hovered over the 1.10.32"));
    }
    //--------------------------------------------------------------------------------------------------------Menu tests
    @Test (priority = 90, description = "Verify that user can select sub sub Tab from menu")
    public void selectSubSubTab () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getMenuTab());
        waitUntilElementisClickable(sidebarPage.getMenuTab());
        sidebarPage.clickOnMenuTab();
        scrollIntoView(menuPage.getPageHeading());
        Actions action = new Actions(driver);
        action.moveToElement(menuPage.getMainItem2Tab()).perform();
        waitUntilElementisVisible(menuPage.getSubSubListTab());
        action.moveToElement(menuPage.getSubSubListTab()).perform();
        waitUntilElementisVisible(menuPage.getSubSubItem1Tab());
        Assert.assertTrue(menuPage.getSubSubItem1Tab().isDisplayed());
        Assert.assertTrue(menuPage.getSubSubItem2Tab().isDisplayed());
    }
    //-------------------------------------------------------------------------------------------------Select Menu tests
    @Test (priority = 100, description = "Verify that user can select value from dropdown menu")
    public void selectSingleValueFromDropdown () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getSelectMenuTab());
        sidebarPage.clickOnSelectMenuTab();
        scrollIntoView(selectMenuPage.getPageHeading());
        Assert.assertTrue(selectMenuPage.getSelectValueFieldValue().getText().equalsIgnoreCase("Select Option"));
        selectMenuPage.enterCharactersInSelectValueField("Group 1");
        Assert.assertTrue(selectMenuPage.getSelectValueFieldValue().getText().equalsIgnoreCase("Group 1, option 1"));
        selectMenuPage.enterCharactersInSelectValueField("A root");
        Assert.assertTrue(selectMenuPage.getSelectValueFieldValue().getText().equalsIgnoreCase("A root option"));
        selectMenuPage.enterCharactersInSelectOneField("ot");
        Assert.assertTrue(selectMenuPage.getSelectOneFieldValue().getText().equalsIgnoreCase("Other"));
        selectMenuPage.enterCharactersInSelectOneField("d");
        Assert.assertTrue(selectMenuPage.getSelectOneFieldValue().getText().equalsIgnoreCase("Dr."));
    }

    @Test (priority = 110, description = "Verify that user can select multi values from dropdown menu")
    public void selectMultiValuesFromMultiselectDropdown () throws InterruptedException {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getSelectMenuTab());
        sidebarPage.clickOnSelectMenuTab();
        scrollIntoView(selectMenuPage.getPageHeading());
        selectMenuPage.enterCharactersInMultiSelectDropdownField("g");
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Green"));
        selectMenuPage.enterCharactersInMultiSelectDropdownField("r");
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Green"));
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Red"));
        selectMenuPage.enterCharactersInMultiSelectDropdownField("blu");
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Green"));
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Red"));
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Blue"));
        selectMenuPage.enterCharactersInMultiSelectDropdownField("b");
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Green"));
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Red"));
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Blue"));
        Assert.assertTrue(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Black"));
        selectMenuPage.getMultiSelectDropdownRemoveAllValuesButton().click();
        Thread.sleep(1000);
        Assert.assertFalse(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Green"));
        Assert.assertFalse(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Red"));
        Assert.assertFalse(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Blue"));
        Assert.assertFalse(selectMenuPage.getMultiSelectDropDownFieldValue().getText().contains("Black"));
    }

    @Test (priority = 120, description = "Verify that user can select value from dropdown menu")
    public void selectSingleValueFromOldStyleSelectMenu () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getSelectMenuTab());
        sidebarPage.clickOnSelectMenuTab();
        scrollIntoView(selectMenuPage.getPageHeading());
        Select color = new Select(selectMenuPage.getOldStyleSelectMenu());
        color.selectByVisibleText("Aqua");
        String selectedColor = color.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedColor, "Aqua");
    }

    @Test (priority = 130, description = "Verify that user can select multi values from dropdown menu")
    public void selectMultiValueFromStandardSelectMenu () {
        scrollIntoView(sidebarPage.getWidgetsTab());
        sidebarPage.clickOnWidgetsTab();
        scrollIntoView(sidebarPage.getSelectMenuTab());
        sidebarPage.clickOnSelectMenuTab();
        scrollIntoView(selectMenuPage.getPageHeading());
        Select car = new Select(selectMenuPage.getStandardMultySelectMenu());
        car.selectByVisibleText("Opel");
        car.selectByIndex(0);
        car.selectByValue("audi");
        String selectedCars = "";
        List<WebElement> listOfSelectedCars = car.getAllSelectedOptions();
        for (int i = 0; i<listOfSelectedCars.size(); i++) {
            selectedCars += listOfSelectedCars.get(i).getText() + " ";
        }
        Assert.assertTrue(selectedCars.contains("Opel"));
        Assert.assertTrue(selectedCars.contains("Volvo"));
        Assert.assertTrue(selectedCars.contains("Audi"));
        Assert.assertFalse(selectedCars.contains("Saab"));
    }

}

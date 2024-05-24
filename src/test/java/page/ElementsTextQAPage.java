package page;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Keywords.WebUi.*;
import static Keywords.WebUi.waitForElementVisible;

public class ElementsTextQAPage {

    String URL = "https://demoqa.com/text-box";
    public By userNameInput = By.id("userName");
    public By emailInput = By.id("userEmail");
    public By currentAddressInput = By.id("currentAddress");
    public By permanentAddressInput = By.id("permanentAddress");
    public By submitBtn = By.id("submit");
    public By nameMessage = By.id("name");
    public By emailMessage = By.id("email");
    public By currentAddressMessage = By.id("currentAddress");
    public By permanentAddressMessage = By.id("permanentAddress");


    public void verifyNameMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(nameMessage).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(nameMessage), expected, message);
    }
    public void verifyEmailMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(emailMessage).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(emailMessage), expected, message);
    }
    public void verifyCurrentAddressMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(currentAddressMessage).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(currentAddressMessage), expected, message);
    }
    public void verifyPermanentAddressMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(permanentAddressMessage).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(permanentAddressMessage), expected, message);
    }



    public void enterFullName(String fullName) {
        setText(userNameInput, fullName);

    }

    public void enterEmail(String email) {
        setText(emailInput, email);

    }
    public void enterCurrentAddress(String currentAddress){
        setText(currentAddressInput,currentAddress);

    }
    public void enterPermanentAddress(String permanentAddress){
        setText(permanentAddressInput,permanentAddress);

    }
    public void enterSubmitBtn(){
        clickElement(submitBtn);

    }

    public void submitTextBox(String fullName,String email, String currentAddress, String permanentAddress  ){
        openURL(URL);
        enterFullName(fullName);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
        enterSubmitBtn();
        waitForElementVisible(nameMessage);
        waitForElementVisible(emailMessage);
        waitForElementVisible(currentAddressMessage);
        waitForElementVisible(permanentAddressMessage);

    }


}

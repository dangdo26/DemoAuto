package page;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Keywords.WebUi.*;

public class ElementsRadioQAPage {

    String URL = "https://demoqa.com/radio-button";

    By yesR = By.id("yesRadio");
    By impressiveR = By.id("impressiveRadio");
    By noR = By.id("noRadio");
    By resultMessage = By.className("text-success");


    public void verifyResultMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(resultMessage).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(resultMessage), expected, message);
    }

    public void clickYes() {
        openURL(URL);
        clickElement(yesR);

    }
    public void clickImpressive() {
        openURL(URL);
        clickElement(impressiveR);

    }
    public void clickNo() {
        openURL(URL);
        verifyDisableElement(noR);

    }


}

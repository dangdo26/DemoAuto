package page;

import constant.ConstantGlobal;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Keywords.WebUi.*;

public class LoginPage {

    String URL = "https://" + ConstantGlobal.ENVIRONMENT + ".admin.techres.vn/login";
    public By usernameInput = By.name("username");

    public By passwordInput = By.name("password");
    public By loginButton = By.xpath("//*[@id=\"login-form\"]/div/div[3]/button");

    public By messageErrorLogin = By.xpath("//*[@id=\"login-form\"]/div/p");

    public void verifyErrorMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(messageErrorLogin).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(messageErrorLogin), expected, message);
    }

    public void enterUsername(String userName) {
        setText(usernameInput, userName);

    }

    public void enterPassword(String password) {
        setText(passwordInput, password);

    }

    public void clickBtnLogin() {
        clickElement(loginButton);

    }

    public void loginPass(String userName, String password) {
        openURL(URL);
        enterUsername(userName);
        enterPassword(password);
        clickBtnLogin();
    }
    public void loginFail(String userName, String password) {
        openURL(URL);
        enterUsername(userName);
        enterPassword(password);
        clickBtnLogin();
        waitForElementVisible(messageErrorLogin);
    }





}

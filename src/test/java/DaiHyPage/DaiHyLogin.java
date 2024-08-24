package DaiHyPage;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Keywords.WebUi.*;

public class DaiHyLogin {

    String URL = "https://beta.daihy.ohqsoft.com/login";
    String expectedUrl = "https://beta.daihy.ohqsoft.com/branch-dashboard";




    By usernameInput = By.className("username");
    By passwordInput = By.className("password");
    By loginButton = By.className("login");
    By seemtMenuName = By.className("seemt-menu-name");



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
        waitForElementVisible(seemtMenuName);
        String actualUrl = getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "AcuaURL and expectedURL don't match");
    }



}

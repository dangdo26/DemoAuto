package TestcaseDaiHy;

import DaiHyPage.DaiHyLogin;
import common.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    DaiHyLogin login = new DaiHyLogin();




    @Test
    public void loginPass(){
        login.loginPass("tr000001","kipkyc-zuczu3-tutgEz");

    }

}

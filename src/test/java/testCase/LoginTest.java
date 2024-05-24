package testCase;

import helpers.PropertiesHelper;
import helpers.SystemsHelper;
import page.LoginPage;
import common.BaseTest;
import helpers.CaptureHelper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    CaptureHelper cap = new CaptureHelper();
    ArrayList<HashMap<String, String>> loginDataList = PropertiesHelper.readJsonData(SystemsHelper.getCurrentDir() + "src/test/resources/dataSet/login.json");
    HashMap<String, String> data;


    @Test
    public void LoginTestPass() {
        data = loginDataList.get(0);
        loginPage.loginPass(data.get("username"), data.get("pass"));
    }

    @Test
    public void LoginTestInvalidUsername() {
        data = loginDataList.get(1);
        loginPage.loginFail(data.get("username"), data.get("pass"));
        loginPage.verifyErrorMessageDisplay("tai khoản sai", "không trùng khớp tên thông báo");
    }

    @Test
    public void LoginTestInvalidPassword() {
        data = loginDataList.get(2);
        loginPage.loginFail(data.get("username"), data.get("pass"));
        loginPage.verifyErrorMessageDisplay("mk sai", "không trùng khớp tên thông báo");
    }

    @Test
    public void LoginTestInvalidUserAndPass() {
        data = loginDataList.get(3);
        loginPage.loginFail(data.get("username"), data.get("pass"));
        loginPage.verifyErrorMessageDisplay("sai tk và mk", "không trùng khớp tên thông báo");
    }

    @Test
    public void LoginTestEmptyUserAndPass() {
        data = loginDataList.get(4);
        loginPage.loginFail(data.get("username"), data.get("pass"));
        loginPage.verifyErrorMessageDisplay("không được đê trống mk và tk", "không trùng khớp tên thông báo");
    }

    @Test
    public void LoginTestEmptyUsername() {
        data = loginDataList.get(5);
        loginPage.loginFail(data.get("username"), data.get("pass"));
        loginPage.verifyErrorMessageDisplay("trống user", "không trùng khớp tên thông báo");
    }

    @Test
    public void LoginTestEmptyPassword() {
        data = loginDataList.get(6);
        loginPage.loginFail(data.get("username"), data.get("pass"));
        loginPage.verifyErrorMessageDisplay("Hãy nhập mật khẩu", "không trùng khớp tên thông báo");
    }

    @Test
    public void LoginTestUppercaseLetters() {
        data = loginDataList.get(7);
        loginPage.loginPass(data.get("username"), data.get("pass"));
    }

}
